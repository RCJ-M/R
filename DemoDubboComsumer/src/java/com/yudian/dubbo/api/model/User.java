package com.yudian.dubbo.api.model;

import java.io.Serializable;

/**
 * Created by yudian-it on 2017/4/26.
 */
public class User  {      //这里不实现序列化好像也是可以的

   // private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
