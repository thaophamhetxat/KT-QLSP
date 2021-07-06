package com.codegym;

import java.io.*;
import java.util.Scanner;

public class MenuSanPham {
    static Scanner scanner = new Scanner(System.in);
    static ManagerSanPham managerSanPham = new ManagerSanPham();
    static File sanPham = new File("sanPham.csv");
    static String tieuDe = ("maSanPham,tenSanPham,gia,soLuong,moTa");

    public void menu() throws IOException {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM");
            System.out.println("Chọn một chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhập");
            System.out.println("4. Xóa");
            System.out.println("5. Xắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Tìm sản phẩm đắt nhất");
            System.out.println("9. Thoát");
            System.out.println("Chọn chức năng: ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    managerSanPham.show();
                    break;
                case 2:
                    managerSanPham.themSanPham("sp");
                    break;
                case 3:
                    managerSanPham.editSanPham();
                    break;
                case 4:
                    managerSanPham.xoaSanPham();
                    break;
                case 5:
                    managerSanPham.sortSanPham();
                    break;
                case 6: {
                    sanPham.createNewFile();
                    docFile();
                    for (SanPham sv : managerSanPham.list) {
                        System.out.println(sv);
                    }
                }
                break;
                case 7: {
                    ghiFile();
                }
                break;
                case 8:
                    managerSanPham.searchSanPham();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    public static void docFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(sanPham);
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(", ");
                if (str.length >= 6) {
                    managerSanPham.list.add(new SanPham(str[0], str[1], Integer.parseInt(str[2]), str[3], str[4]));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
    }

    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(sanPham);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(tieuDe);
            bufferedWriter.newLine();
            for (SanPham sv : managerSanPham.list) {
                bufferedWriter.write(sv.ghi());

                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }

    }

}
