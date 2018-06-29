/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

import demointerface.model.ISanPham;

/**
 *
 * @author gamelord
 */
public interface IQuanLySanPham {
    ISanPham taoSanPham(int loai);
    void nhapThongTinSanPham(ISanPham[] danhSach);
    void hienThongTinSanPham(ISanPham[] danhSach);
    ISanPham timGiaSanPhamLonNhat(ISanPham[] danhSach);
}
