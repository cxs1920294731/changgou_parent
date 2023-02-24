package com.changgou.goods;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandTest {
    @Autowired
    private BrandService brandService;
    @Test
    public void addtest(){
//        List<Brand> list = brandService.findList();
//        System.out.println(list);
        for (int i = 10; i < 1000; i++) {
            Brand brand = new Brand();
            brand.setName("华为"+i);
            brand.setImage("http://image/huawei"+i);
            brand.setLetter(Integer.toString(i));
            brandService.add(brand);
        }
    }

}
