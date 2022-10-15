package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean {
    private int hNo;
    private String city;

    public Address() {
    }

    public Address(int hNo, String city) {
        this.hNo = hNo;
        this.city = city;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hNo=" + hNo +
                ", city=" + city +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init address");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy address");
    }
}
