package com.changgou.goods.service.impl;

import com.changgou.goods.GoodsApplication;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {GoodsApplication.class})
@RunWith(SpringRunner.class)
public class BrandServiceImplTest extends TestCase {
    @Autowired
    private BrandService brandService;
    @Test
    public void testAdd() {
        List<Brand> list = brandService.findList();
        System.out.println(list);
//        for (int i = 3; i < 1000; i++) {
//            Brand brand = new Brand();
//            brand.setName("华为"+i);
//            brand.setImage("http://image/huawei"+i);
//            brand.setLetter("H"+i);
//            brandService.add(brand);
//        }
    }

}