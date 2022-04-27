package com.company.view;

import com.company.controller.DanhBaController;

import java.util.Scanner;

public class Main {
    public Main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Chương trình quản lý danh ba==========");
        System.out.println(" Chọn chức năng theo số ( để tiếp tục)");
        System.out.println("0. Tạo nhóm danh bạ");
        System.out.println("1. xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhập");
        System.out.println("4. Xoá");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi từ file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng : ");

        int chooseProfile = scanner.nextInt();
        switch (chooseProfile){
            case 0:
                new DanhBaView().createNhomDanhBa();
                break;
            case 1:
                new DanhBaView().showDanhBa();
                break;
            case 2:
                new DanhBaView().createDanhBa();
                break;
            case 3:
                new DanhBaView().editDanhBa();
                break;
            case 4:
                new DanhBaView().deleteByIDDanhBa();
                break;
            case 5 :
                new DanhBaView().searchDanhBa();
                break;
            case 6:
                new DanhBaView().ShowNhomDanhBa();
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}
