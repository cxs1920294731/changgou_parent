package com.changgou.system.controller;

import com.changgou.common.pojo.Result;
import com.changgou.common.pojo.StatusCode;
import com.changgou.system.pojo.Admin;
import com.changgou.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/{id}")
    public Result<Admin> findId(@PathVariable("id") Integer id){
        Admin id1 = adminService.findId(id);
        System.out.println(id1);
        return new Result<>(true,StatusCode.OK,"success",id1);
    }

    @PostMapping
    public Result addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
        return new Result(true, StatusCode.OK,"新增成功");
    }

    @PostMapping("/login")
    public Result login(@RequestBody Admin admin){
        boolean login = adminService.login(admin);
        if (login){
            return new Result(true,StatusCode.OK,"登录成功");
        }else {
            return new Result(true,StatusCode.OK,"登录失败");
        }

    }

}
