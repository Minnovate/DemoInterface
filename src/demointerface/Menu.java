/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

import demointerface.model.ISanPham;
import java.util.Scanner;

/**
 *
 * @author gamelord
 */
public class Menu {
    public int hienMenu(){
        System.out.println("1. Nhap");
        System.out.println("2. Hien");
        System.out.println("3. Gia lon nhat");
        System.out.println("4. Thoat");
        int chon=new Scanner(System.in).nextInt();
        return chon;
    }
    
    public int chonLoaiSanPham(){
        System.out.println("1. San Pham So");
        System.out.println("2. San pham nong nghiep");
        System.out.println("3. San pham cong nghiep");
        int chon=new Scanner(System.in).nextInt();
        if(chon>3|| chon<1) {
            System.out.println("Chi duoc chon tu 1 den 3");
            return chonLoaiSanPham();// de chon lai menu khi khong chon dung lua chon tu 1-3
        }
        System.out.println("Ban da chon loai san pham "+chon);
        return chon;
    }
    
    public void chay(){
        ISanPham[] danhSach = null;
        IQuanLySanPham qlsp = null;
        QuanLySanPham qlsp = new QuanLySanPham();
        while(true){
            int chon = hienMenu();
            switch(chon){
                case 1:
                    danhSach = taoDanhSach(); 
                    //khoi tao tung phan tu
                    for (int i = 0; i < danhSach.length; i++) {
                        danhSach[i]=qlsp.taoSanPham(chonLoaiSanPham());
                        danhSach[i].nhap();
                    }
                    qlsp.nhapThongTinSanPham(danhSach);
                    break;
                case 2:
                    qlsp.hienThongTinSanPham(danhSach);
                    break;
                case 3:
                    ISanPham timGiaLonNhat = qlsp.timGiaSanPhamLonNhat(danhSach);
                    System.out.println("San pham gia lon nhat: "+timGiaLonNhat);
                    break;
                case 4:
                    System.out.println("Bye bye");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai lua chon, nhap lai");
            }
                
            
        }
    }
    
    public ISanPham[] taoDanhSach(){
        ISanPham[] danhSach = null;
        int soPhanTu;
        System.out.println("Nhap so phan tu: ");
        soPhanTu = new Scanner(System.in).nextInt();
        if(soPhanTu<=0) {
            System.out.println("Moi nhap vao so phan tu lon hon 0: ");    
            return taoDanhSach();
        }
        danhSach = new ISanPham[soPhanTu];
        return danhSach;
    }
}
