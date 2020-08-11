package com.eyevision.kf.service.service;

import com.eyevision.kf.service.BaseTest;
import com.eyevision.kf.service.service.site.StCouponService;
import com.eyevision.kf.service.vo.CouponVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class StCouponServiceTest extends BaseTest {
    @Autowired
    private StCouponService sitCouponService;

    @Test
    public void addCoupon(){
        CouponVO couponVO = new CouponVO();
        couponVO.setName("2%discount");
        couponVO.setValidOrderMoney(new BigDecimal(123));
        couponVO.setHasAcquireNum(123);
        couponVO.setAcquireStartDate(124L);
        couponVO.setAcquireEndDate(124L);
        couponVO.setValidRule(1);
        couponVO.setLimitMemberAcquire(true);
        couponVO.setCanAcquireNum(2);
        couponVO.setCanUseOrderType(5);
        couponVO.setLimitUse(true);
        couponVO.setReduceMoney(new BigDecimal(12));
        sitCouponService.add(couponVO);
    }

    @Test
    public void on() {
        sitCouponService.on(Long.decode("1291563211945934849"));
    }

    @Test
    public void off() {
        sitCouponService.off(Long.decode("1291659282785239040"));
    }

    @Test
    public void listGoods() {
        System.out.println(sitCouponService.listGoods(Long.decode("1291563211945934849")).size());
    }

    @Test
    public void test() {
        Integer[] arr={1,2};
        sitCouponService.test(arr).forEach(temp -> {
            System.out.println(temp.toString());
        });
    }
}
