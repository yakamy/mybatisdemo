package com.yakamy.mybatis.dao.model;

/**
 * @author yakamy
 * @create 2017-03-30 12:46
 */
public class User {
    private long dealerId;

    private String username;

    private String password;

    public long getDealerId() {
        return dealerId;
    }

    public void setDealerId(long dealerId) {
        this.dealerId = dealerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
