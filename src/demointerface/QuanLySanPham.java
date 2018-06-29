/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

import demointerface.model.SanPhamSo;
import demointerface.model.SanPham;
import demointerface.model.SanPhamNongNghiep;
import demointerface.model.SanPhamCongNghiep;
import demointerface.model.ISanPham;

/**
 *
 * @author gamelord
 */
public class QuanLySanPham implements IQuanLySanPham {
    
    private static final int SP_SO=1;
    private static final int SP_NN=2;
    private static final int SP_CN=3;
    
    @Override
    public SanPham taoSanPham(int loai){
       
        switch (loai){
            case SP_SO:
                return new SanPhamSo();
            case SP_NN:
                return new SanPhamNongNghiep();
            case SP_CN:
                return new SanPhamCongNghiep();
            default:
                return null;
       } 
           
    }
    
    @Override
    public void nhapThongTinSanPham(ISanPham[] danhSach){
        if(danhSach!=null){
            for (int i = 0; i < danhSach.length; i++) {
                if(danhSach[i]!=null){
                    danhSach[i].nhap();
                }
            }
        }
            else System.out.println("San pham khong ton tai!");
    }
    
    
    @Override
    public void hienThongTinSanPham(ISanPham[] danhSach){
        if(danhSach!=null){
            for (ISanPham iSanPham : danhSach) {
                if(iSanPham!=null){
                    iSanPham.hien();
                }
                else System.out.println("San pham khong ton tai!");
            }
        }
    }
    
    @Override
    public ISanPham timGiaSanPhamLonNhat(ISanPham[] danhSach){
        ISanPham priceMax = null;
        if(danhSach!=null){
            for (ISanPham iSanPham : danhSach) {
                if(iSanPham == null) continue;
                if(priceMax==null||(priceMax.getGiaBan()<iSanPham.getGiaBan())){
                            priceMax=iSanPham;
                }
            }
        }
        return priceMax;
    }


}
