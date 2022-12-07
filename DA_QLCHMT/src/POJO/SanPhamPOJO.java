/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Luong Vinh Khang
 */
public class SanPhamPOJO {
    String maHang;
    String tenHang;
    String nsx;
    float giaBan;
    int soLuongTon;

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public SanPhamPOJO() {
    }

    public SanPhamPOJO(String maHang, String tenHang, String nsx, float giaBan, int soLuongTon) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nsx = nsx;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
    }
}
