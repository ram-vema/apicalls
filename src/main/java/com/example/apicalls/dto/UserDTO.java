package com.example.apicalls.dto;

public class UserDTO {

    private int userid;

    private String password;

    private String status;

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

    public UserDTO(int userid, String password, String status) {
        this.userid = userid;
        this.password = password;
        this.status = status;
    }

    public UserDTO(){

    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
