package com.yudian.model;

import javax.persistence.*;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
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
