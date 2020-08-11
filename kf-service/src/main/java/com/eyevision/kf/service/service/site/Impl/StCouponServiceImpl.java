package com.eyevision.kf.service.service.site.Impl;

import com.eyevision.framework.common.model.Page;
import com.eyevision.framework.common.model.PageForm;
import com.eyevision.framework.common.support.EntityHandler;
import com.eyevision.framework.common.vo.VOUtil;
import com.eyevision.framework.spring.mybatis.AbstractMapperService;
import com.eyevision.framework.spring.mybatis.IdGenerateUtil;
import com.eyevision.kf.common.enums.CouponStatus;
import com.eyevision.kf.service.entity.Coupon;
import com.eyevision.kf.service.entity.CouponGoods;
import com.eyevision.kf.service.entity.Goods;
import com.eyevision.kf.service.form.CouponForm;
import com.eyevision.kf.service.mapper.CouponGoodsMapper;
import com.eyevision.kf.service.mapper.CouponMapper;
import com.eyevision.kf.service.mapper.GoodsMapper;
import com.eyevision.kf.service.service.site.StCouponService;
import com.eyevision.kf.service.vo.CouponVO;
import com.eyevision.kf.service.vo.GoodsVO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StCouponServiceImpl extends AbstractMapperService<Coupon, CouponVO> implements StCouponService {
    @Autowired
    private CouponGoodsMapper couponGoodsMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private CouponMapper couponMapper;



    @Override
    public void add(CouponVO vo) {
        validate(vo);
        vo.setStatus(CouponStatus.OFF.value);
        vo.setHasAcquireNum(0);
        super.add(vo);
    }

    @Override
    public Page<CouponVO> paging(CouponForm form, PageForm pf) {
        Page<CouponVO> page = new Page<>();
        page.setTotal(((CouponMapper) mapper).selectCountByForm(form));
        if (page.getTotal() > 0) {
            PageHelper.startPage(pf.getPage(), pf.getRows(), false)
                    .setOrderBy(String.format("%s %s", pf.getSort(), pf.getOrder()));
            List<Coupon> list = ((CouponMapper) mapper).selectByForm(form);
            page.setRows(VOUtil.toVO(list, CouponVO.class));
        }
        return page;
    }

    @Override
    public void on(Long id) {
        updateStatus(id, CouponStatus.ON);
    }

    @Override
    public void off(Long id) {
        updateStatus(id, CouponStatus.OFF);
    }

    @Override
    public List<GoodsVO> listGoods(Long id) {
        List<Goods> entities = goodsMapper.selectByCoupon(id);
        return VOUtil.toVO(entities, GoodsVO.class);
    }

    @Override
    public List<CouponVO> test(Integer[] arr) {
        return VOUtil.toVO(couponMapper.test(arr), CouponVO.class);
    }

    @Override
    protected Example formToExample(Object o) {
        return null;
    }

    private void saveGoods(CouponVO vo, Boolean oldLimitUse) {
        if (oldLimitUse != null && oldLimitUse) {
            couponGoodsMapper.deleteByCoupon(vo.getId());
        }
        if (vo.getLimitUse()) {
            String loginUser = getUser();
            List<CouponGoods> list = new ArrayList<>();
            String[] ids = vo.getGoodsIdStr().split(",");
            Arrays.stream(vo.getGoodsIdStr().split(",")).forEach(goodsId->{
                CouponGoods couponGoods = new CouponGoods();
                couponGoods.setCouponId(vo.getId());
                couponGoods.setGoodsId(Long.parseLong(goodsId));
                EntityHandler.init(couponGoods, loginUser);
                couponGoods.setId((Long) IdGenerateUtil.generate());
                list.add(couponGoods);
            });
        }
    }

    private void updateStatus(Long id, CouponStatus couponStatus) {
        Coupon coupon = new Coupon();
        coupon.setId(id);
        coupon.setStatus(couponStatus.value);
        EntityHandler.init(coupon, getUser());
        mapper.updateByPrimaryKeySelective(coupon);
    }
}
