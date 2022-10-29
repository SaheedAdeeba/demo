package com.adeeba.account.model;

import javax.persistence.*;

@Entity
@Table(name = "my_accounts")
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String phone;
    private String panNumber;

    private String address;

    public Account() {

    }

    public Account(String name, String phone, String panNumber, String address) {
        this.name = name;
        this.phone = phone;
        this.panNumber = panNumber;
        this.address= address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAddress(){ return address; }

    public void setAddress(String address) { this.address= address;}

    @Override
    public String toString() {
        return "AccountModel{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", address='" + address + '\'' +
                '}';

    }
}