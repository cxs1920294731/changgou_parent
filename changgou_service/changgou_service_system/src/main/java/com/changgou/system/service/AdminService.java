package com.changgou.system.service;

import com.changgou.system.pojo.Admin;

public interface AdminService {
    public  boolean addAdmin(Admin admin);
    public boolean deleteAdmin(Integer id);
    public boolean updateAdmin(Admin admin);
    public Admin findId(Integer id);
    public boolean login(Admin admin);
}
