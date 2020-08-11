package com.eyevision.kf.service.service;
import com.eyevision.kf.common.enums.GoodsStatus;
import com.eyevision.kf.common.enums.GoodsUpdateModule;
import com.eyevision.kf.service.BaseTest;
import com.eyevision.kf.service.service.site.StGoodsService;
import com.eyevision.kf.service.vo.GoodsDeliveryHospitalVO;
import com.eyevision.kf.service.vo.GoodsNormVO;
import com.eyevision.kf.service.vo.GoodsVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StGoodsServiceTest extends BaseTest {
    @Autowired
    private StGoodsService stGoodsService;

    @Test
    public void addGoods() {
        GoodsVO vo = new GoodsVO();
        vo.setName("pen");
        vo.setCategory1(Long.parseLong("1288776024435195905"));
        vo.setCategory2(Long.parseLong("1288776025303416832"));
        vo.setType(1);
        vo.setAssignable(false);
        vo.setDeliveryType(1);
        vo.setStatus(GoodsStatus.ON_OFFER.value);
        vo.setContent("this is a  pen");
        vo.setUseCommonDistributionBrokerageRate(true);
        vo.setDistributionBrokerageRate(0.01f);
        List<GoodsDeliveryHospitalVO> hospitalList = new ArrayList<>();
        vo.setHospitals(hospitalList);
        List<GoodsNormVO> norms = new ArrayList<>();
        vo.setNorms(norms);
        stGoodsService.save(vo);
    }

    @Test
    public void savePicture() {
        stGoodsService.savePictures(1292140830445797377L, "asd,asd,xcav,asdaf,asd", null);
    }

    @Test
    public void updateGoods(){
        GoodsVO vo = new GoodsVO();
        vo.setName("book");
        vo.setId(Long.decode("1291624376424202241"));
        vo.setStatus(GoodsStatus.OUT_OF_STOCK.value);
        vo.setCategory1(Long.parseLong("1288407407675834369"));
        vo.setCategory2(Long.parseLong("1288410799357820929"));
        vo.setType(1);
        vo.setAssignable(false);
        vo.setDeliveryType(1);
        vo.setContent("this is a book");
        vo.setUseCommonDistributionBrokerageRate(true);
        vo.setDistributionBrokerageRate(0.01f);
        List<GoodsDeliveryHospitalVO> hospitalList = new ArrayList<>();
        vo.setHospitals(hospitalList);
        List<GoodsNormVO> norms = new ArrayList<>();
        vo.setNorms(norms);
        vo.setUpdateModule(GoodsUpdateModule.SAVE_GOODS.value);
        stGoodsService.save(vo);
    }
}
