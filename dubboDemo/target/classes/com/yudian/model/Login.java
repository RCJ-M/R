package com.yudian.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Entity
@Table(name = "login")
public class Login {
    @Id
    private String userId;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Login(String password) {
        this.password = password;
    }

    public Login() {
    }
}
