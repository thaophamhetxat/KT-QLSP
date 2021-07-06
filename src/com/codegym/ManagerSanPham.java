package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerSanPham {
    List<SanPham> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SortSanPham sortSanPham = new SortSanPham();

    public void themSanPham(String SP) {
        SanPham sanPham = create(SP);
        list.add(sanPham);
    }

    private SanPham create(String SP) {
        System.out.println("Mã sản phẩm:");
        String maSanPham = scanner.nextLine();
        System.out.println("Tên sản phẩm:");
        String tenSanPham = scanner.nextLine();
        System.out.println("Gía:");
        int gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Số lượng:");
        String soLuong = scanner.nextLine();
        System.out.println("Mô tả:");
        String moTa = scanner.nextLine();

        if (SP == "sp") {
            return new SanPham(maSanPham,tenSanPham,gia,soLuong,moTa);
        }
        return null;
    }

    public void show() {
        for (SanPham sp : list) {
            System.out.println(sp);
        }
    }

    public void editSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần sửa: ");
        String index4 = scanner.nextLine();


        System.out.println("Mã sản phẩm:");
        String maSanPham = scanner.nextLine();
        System.out.println("Tên sản phẩm:");
        String tenSanPham = scanner.nextLine();
        System.out.println("Gía:");
        int gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Số lượng:");
        String soLuong = scanner.nextLine();
        System.out.println("Mô tả:");
        String moTa = scanner.nextLine();


        for (SanPham sp : list) {
            if (sp.getMaSanPham().equals(index4)) {
                sp.setMaSanPham(maSanPham);
                sp.setTenSanPham(tenSanPham);
                sp.setGia(gia);
                sp.setSoLuong(soLuong);
                sp.setMoTa(moTa);
            }
        }
    }

    public void xoaSanPham() {
        System.out.println("Nhập mã sản phẩm cần xóa");
        String tenSP = scanner.nextLine();
        list.removeIf(x -> x.getMaSanPham().equals(tenSP));
    }

    public void sortSanPham() {
        Collections.sort(list, sortSanPham);
    }

    public void searchSanPham(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGia() > max){
                max = list.get(i).getGia();
                index = i;
            }
        }
        System.out.println(list.get(index));
    }
}
