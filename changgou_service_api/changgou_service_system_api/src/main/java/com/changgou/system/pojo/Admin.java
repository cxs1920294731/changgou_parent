package com.changgou.system.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_admin")
public class Admin {
    @Id
    private Integer id;
    private String login_name;
    private String password;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", login_name='" + login_name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
