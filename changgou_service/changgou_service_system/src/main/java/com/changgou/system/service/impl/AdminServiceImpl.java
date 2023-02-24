package com.changgou.system.service.impl;

import com.changgou.system.dao.AdminMapper;
import com.changgou.system.pojo.Admin;
import com.changgou.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public boolean addAdmin(Admin admin) {
        String gensalt = BCrypt.gensalt();
        String hashpw = BCrypt.hashpw(admin.getPassword(), gensalt);
        admin.setPassword(hashpw);
        adminMapper.insertSelective(admin);
        return true;
    }

    @Override
    public boolean deleteAdmin(Integer id) {
        return false;
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return false;
    }

     @Override
    public Admin findId(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        System.out.println(admin);
        return admin;
    }

    @Override
    public boolean login(Admin admin) {
        Admin admin1 = new Admin();
        admin1.setLogin_name(admin.getLogin_name());
        admin1.setStatus("y");
        Admin selectOne = adminMapper.selectOne(admin1);

        if (selectOne == null){
            return  false;
        }else {
            return BCrypt.checkpw(admin.getPassword(),selectOne.getPassword());
        }

    }
}
