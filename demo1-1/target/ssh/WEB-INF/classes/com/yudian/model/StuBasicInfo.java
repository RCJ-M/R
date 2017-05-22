package com.yudian.model;

import com.sun.istack.internal.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yudian-it on 2017/3/21.
 */
@Entity
@Table(name = "stu_basic_info")
public class StuBasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;//学号
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "sex")
    private String sex;
    @Column(name = "address")
    private String address;//家庭住址
   /*@DateTimeFormat(pattern = "yyyy-MM-dd")*/ /*使用此注解，要在依赖中加入hibernate-validator、hibernate-annotation及相关依赖，但是会有其他错误出现*/

    private String birthday;
   @Column(name = "phone")
    private String  phone;

    private String email;

    private String religon;//宗教信仰

    private String nation;//民族

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReligon() {
        return religon;
    }

    public void setReligon(String religon) {
        this.religon = religon;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StuBasicInfo{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", religon='" + religon + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
