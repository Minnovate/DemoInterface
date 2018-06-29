/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.model;

/**
 *
 * @author gamelord
 */
public class SanPhamCongNghiep extends SanPham {

    private int thoiGianBaoHanh;
    private float giaXuatXuong;
    private static final int HE_SO=1000;
    
    public SanPhamCongNghiep() {
    }

    public SanPhamCongNghiep(int ma, String ten) {
        super(ma, ten);
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public float getGiaXuatXuong() {
        return giaXuatXuong;
    }

    public void setGiaXuatXuong(float giaXuatXuong) {
        this.giaXuatXuong = giaXuatXuong;
    }

    @Override
    public float getGiaBan() {
        return getGiaXuatXuong()+getThoiGianBaoHanh()*HE_SO;
    }

    @Override
    public String toString() {
        return super.toString()+ " - SanPhamCongNghiep{" + "thoiGianBaoHanh=" + thoiGianBaoHanh + ", giaXuatXuong=" + giaXuatXuong + '}';
    }
    
    
}
