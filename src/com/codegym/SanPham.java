package com.codegym;

public class SanPham {
    String maSanPham;
    String tenSanPham;
    int gia;
    String soLuong;
    String moTa;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, int gia, String soLuong, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", gia='" + gia + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", moTa='" + moTa + '\'' +
                '}';
    }

    public String ghi() {
        return maSanPham +
                ", " + tenSanPham +
                ", " + gia +
                ", " + soLuong +
                ", " + moTa;
    }
}
