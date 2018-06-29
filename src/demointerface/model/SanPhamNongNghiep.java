/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.model;

import java.util.Scanner;

/**
 *
 * @author gamelord
 */
public class SanPhamNongNghiep extends SanPham {
    
    private int hanDung;
    private float giaHienTai;
    private static final int HE_SO=500;

    public int getHanDung() {
        return hanDung;
    }

    public void setHanDung(int hanDung) {
        this.hanDung = hanDung;
    }

    public float getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(float giaHienTai) {
        this.giaHienTai = giaHienTai;
    }

    public SanPhamNongNghiep() {
    }

    public SanPhamNongNghiep(int ma, String ten) {
        super(ma, ten);
    }

    @Override
    public String toString() {
        return super.toString()+" - SanPhamNongNghiep{" + "hanDung=" + hanDung + ", giaHienTai=" + giaHienTai + '}';
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Han dung: ");
        this.hanDung=new Scanner(System.in).nextInt();
        System.out.println("giaHienTai: ");
        this.giaHienTai=new Scanner(System.in).nextInt();
    }
        
    
    @Override
    public float getGiaBan() {
        return getGiaHienTai()+getHanDung()*HE_SO;
    }
    
}
