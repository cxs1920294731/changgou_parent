package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;
import com.github.pagehelper.Page;

import java.util.List;

public interface BrandService {
    /*
    品牌查询
     */
    List<Brand> findList();

    public List<Brand> finList();

    /*

    根据id查询
     */
    Brand findId(Integer id);

    /*
    新增
     */
    void add(Brand brand);

    /*
    修改
     */
    void update(Brand brand);

    /*
    删除
     */
    void delete(Integer id);

    /*
    分页
     */
    Page<Brand> findPage(int page, int size);
}

