package com.eyevision.kf.service.service;
import com.eyevision.kf.service.BaseTest;
import com.eyevision.kf.service.service.site.StCouponGoodsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class StCouponGoodsServiceTest extends BaseTest {
    @Autowired
    private StCouponGoodsService stCouponGoodsService;

    @Test
    public void save() {
        stCouponGoodsService.save(Long.decode("1291624376424202241"), Long.decode("1291563211945934849"));
        stCouponGoodsService.save(Long.decode("1291660632449351681"), Long.decode("1291563211945934849"));
        stCouponGoodsService.save(Long.decode("1291660885420408832"), Long.decode("1291563211945934849"));

    }

}
