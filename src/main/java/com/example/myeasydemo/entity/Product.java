package com.example.myeasydemo.entity;

public class Product {
    private Integer id;
    private String pname;
    private Float pprice;
    private Integer pcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Float getPprice() {
        return pprice;
    }

    public void setPprice(Float pprice) {
        this.pprice = pprice;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }
}
