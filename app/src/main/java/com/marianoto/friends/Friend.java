package com.marianoto.friends;

/**
 * Created by mariain on 12/9/16.
 */

public class Friend {
    private int _id;
    private String name;
    private String phone;
    private String email;

    public Friend(int _id, String name, String phone, String email) {
        this._id = _id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getid() {
        return _id;
    }

    public void setid(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
