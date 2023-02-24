package com.changgou.goods.controller;

import com.changgou.common.pojo.PageResult;
import com.changgou.common.pojo.Result;
import com.changgou.common.pojo.StatusCode;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/brand")
@RestController
@CrossOrigin
public class BrandControl {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public Result<List<Brand>> findList() {
        List<Brand> brandList = brandService.findList();
        System.out.println(brandList);
        System.out.println(brandList);
        System.out.println(brandList);
//        Result<Object> chenggong = new Result<>(true, StatusCode.OK, "chenggong", brandList);
        return new Result<>(true, StatusCode.OK, "查询成功", brandList);

    }

    @GetMapping("find")
    public Result<List<Brand>> finList() {
        List<Brand> brandList = brandService.finList();
//        System.out.println(brandList);
//        Result<Object> chenggong = new Result<>(true, StatusCode.OK, "chenggong", brandList);
        return new Result<>(true, StatusCode.OK, "查询成功1", brandList);

    }

    @GetMapping("/{id}")
    public Result<Brand> findId(@PathVariable("id") Integer id) {
        Brand brand = brandService.findId(id);
        return new Result<>(true, StatusCode.OK, "success", brand);
    }

    @PostMapping
    public Result add(@RequestBody Brand brand) {
        System.out.println(brand);
        brandService.add(brand);
        return new Result(true, StatusCode.OK, "插入成功");
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable("id") Integer id, @RequestBody Brand brand) {
        brand.setId(id);
        brandService.update(brand);
        return new Result(true, StatusCode.OK, "修改");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        brandService.delete(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    @GetMapping("/search/{page}/{size}")
    public Result findPage(@PathVariable("page") int page, @PathVariable("size") int size) {

        Page<Brand> page1 = brandService.findPage(page, size);
        PageResult pageResult = new PageResult(page1.getTotal(), page1.getResult());
        return new Result(true, StatusCode.OK, "插入成功", pageResult);
    }
}
