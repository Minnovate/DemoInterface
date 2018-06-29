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
public class SanPhamSo extends SanPham{
    
    private static int HE_SO = 1000;
    private int dungLuong;

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }
    
    @Override
    public float getGiaBan() {
        return this.getDungLuong()*HE_SO;
    }

    @Override
    public void hien() {
        super.hien(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap dung luong:");
        setDungLuong(new Scanner(System.in).nextInt());
    }

    @Override
    public String toString() {
        return super.toString()+" - SanPhamSo{" + "dungLuong=" + dungLuong + '}';
    }
    
    
    
}
