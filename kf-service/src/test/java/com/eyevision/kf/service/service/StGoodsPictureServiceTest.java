package com.eyevision.kf.service.service;
import com.eyevision.kf.service.BaseTest;
import com.eyevision.kf.service.service.site.StGoodsPictureService;
import com.eyevision.kf.service.vo.GoodsPictureVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class StGoodsPictureServiceTest extends BaseTest {
    @Autowired
    private StGoodsPictureService sitGoodsPictureService;

    @Test
    public void addGoodsPicture(){
            GoodsPictureVO vo = new GoodsPictureVO();
            vo.setUrl("http:\\"+UUID.randomUUID().toString() );
            vo.setGoodsId(1291661091322986497L);
            sitGoodsPictureService.add(vo);
    }
}
