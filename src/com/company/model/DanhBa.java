package com.company.model;

import java.io.Serializable;

public class DanhBa implements Serializable  {
    private int id;
    private String name;
    private String gioitinh;
    private int sodienthoai;
    private String diachi;
    private NhomDanhBa nhomDanhBa;

    public DanhBa() {
    }

    public DanhBa(int id, String name, String gioitinh, int sodienthoai, String diachi, NhomDanhBa nhomDanhBa) {
        this.id = id;
        this.name = name;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
        this.nhomDanhBa = nhomDanhBa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public NhomDanhBa getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(NhomDanhBa nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", sodienthoai=" + sodienthoai +
                ", diachi='" + diachi + '\'' +
                ", nhomDanhBa=" + nhomDanhBa +
                '}';
    }
}
