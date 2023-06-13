package com.example.rest_api_crudspring_mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("user")
public class User {
    @Id
    @Indexed(unique = true)
    private Long phoneNo;
    private String name;
    private Long battery;
    @Field(name = "batteries")
    private List<Long> batteryList;
    private Double walletAmount;

    public User(Long phoneNo, String name, Long battery, List<Long> batteryList, Double walletAmount) {
        this.phoneNo = phoneNo;
        this.name = name;
        this.battery = battery;
        this.batteryList = batteryList;
        this.walletAmount = walletAmount;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBattery() {
        return battery;
    }

    public void setBattery(Long battery) {
        this.battery = battery;
    }

    public List<Long> getBatteryList() {
        return batteryList;
    }

    public void setBatteryList(List<Long> batteryList) {
        this.batteryList = batteryList;
    }

    public Double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(Double walletAmount) {
        this.walletAmount = walletAmount;
    }
}
