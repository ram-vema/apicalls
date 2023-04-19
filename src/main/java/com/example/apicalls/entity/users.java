package com.example.apicalls.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class users {

    @Id
    private int userid;

    private String password;

    private String status;

    public users(int userid, String password, String status) {
        this.userid = userid;
        this.password = password;
        this.status = status;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
        return "users{" +
                "userid=" + userid +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public users() {
    }
}
