/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Shubham
 */
public class LibUserDTO implements Serializable{
    String userid;
    String name;
    String password;
    String email;
    String address;
    String appGroup;
    Boolean active;
    String phoneNumber;

    public LibUserDTO(String userid, String name, String password, String email, String address, String appGroup, Boolean active, String phoneNumber) {
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.appGroup = appGroup;
        this.active = active;
        this.phoneNumber = phoneNumber;
    }

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getAppGroup() {
        return appGroup;
    }

    public Boolean getActive() {
        return active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
}
