package com.syl.pojo;

import java.io.Serializable;
import java.util.List;

public class UserAddress implements Serializable {
    private int id;
    private String username;
    private List addressList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List getAddressList() {
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}