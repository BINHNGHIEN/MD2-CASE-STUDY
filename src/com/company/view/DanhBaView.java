package com.company.view;

import com.company.controller.DanhBaController;
import com.company.controller.NhomDanhBaController;
import com.company.model.DanhBa;
import com.company.model.NhomDanhBa;
import com.company.service.danhba.DanhBaService;
import com.company.service.nhomdanhba.NhomDanhBaService;

import java.util.List;
import java.util.Scanner;

import static com.company.service.danhba.DanhBaService.danhBaList;

public class DanhBaView {
    DanhBaController danhBaController = new DanhBaController();
    NhomDanhBaController nhomDanhBaController = new NhomDanhBaController();
    List<DanhBa> danhBaList = DanhBaService.danhBaList;
    List<NhomDanhBa> nhomDanhBaList = NhomDanhBaService.nhomDanhBaList;
    Scanner scanner= new Scanner(System.in);



    public void createDanhBa() {
        while (true) {
            int id;
            if (DanhBaService.danhBaList.size() == 0) {
                id = 1;
            } else {
                id = danhBaList.get(danhBaList.size() - 1).getId() + 1;
            }
            System.out.println(" Nhập tên: ");
            String name = scanner.nextLine();

            System.out.println("Nhập số điện thoại");
            int sodienthoai = Integer.parseInt(scanner.nextLine());

            System.out.println(" Nhập gioitinh : ");
            String gioitinh = scanner.nextLine();

            System.out.println(" Nhập điạ chỉ : ");
            String diachi = scanner.nextLine();


            System.out.println("nhập ID danh bạ : ");
            int idClass = Integer.parseInt(scanner.nextLine());
            NhomDanhBa nhomDanhBa = nhomDanhBaController.findById(idClass);
            DanhBa danhBa = new DanhBa(id, name,  gioitinh,sodienthoai, diachi,nhomDanhBa);
            danhBaController.createDanhBa(danhBa);
            System.out.println("Nhap quit de thoat");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }



    public void editDanhBa() {
        System.out.println("Nhap  ID  danh ba : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên ");
        String name = scanner.nextLine();

        System.out.println("Nhập số điện thoại ");
        int sodienthoai = Integer.parseInt(scanner.nextLine());


        System.out.println("Nhập giới tính ");
        String gioitinh = scanner.nextLine();


        System.out.println("Nhập địa chỉ ");
        String diachi = scanner.nextLine();

        for (int i = 0; i < danhBaList.size(); i++) {
                if (id == danhBaList.get(i).getId())
                    name = danhBaList.get(i).getName();
            }

        for (int i = 0; i < danhBaList.size(); i++) {
                if (id == danhBaList.get(i).getId())
                    sodienthoai = (int) danhBaList.get(i).getSodienthoai();
            }

        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == danhBaList.get(i).getId())
                gioitinh = danhBaList.get(i).getName();
        }
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == danhBaList.get(i).getId())
                diachi = danhBaList.get(i).getName();
        }

        danhBaController.editDanhBa(id,name,gioitinh,sodienthoai,diachi);

        new Main();
    }

    public void deleteByIDDanhBa() {
        System.out.println("Nhap ID danh ba: ");
        int id = Integer.parseInt(scanner.nextLine());
        danhBaController.deleteByIDDanhBa(id);

        new Main();
    }

    public void searchDanhBa() {
        System.out.println(" Nhap ID danh Ba: ");
        int id = Integer.parseInt(scanner.nextLine());
        danhBaController.searchByIDDanhBa(id);
        System.out.println(" Nhan quit de thoat  ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void showDanhBa() {
        System.out.println(danhBaController.showDanhBa());
        System.out.println("Nhap quit de tro ve ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void createNhomDanhBa(){
        while (true){
            int id;
            if(nhomDanhBaList.size()==0){
                id = 1;
            } else {
                id =  nhomDanhBaList.get(nhomDanhBaList.size()-1).getId()+1;
            }
            System.out.println("nhap ten nhom danh ba");
            String name = scanner.nextLine();
            NhomDanhBa nhomDanhBa = new NhomDanhBa(id,name);
            nhomDanhBaController.createNhomDanhBa(nhomDanhBa);
            System.out.println("nhap quit de thoat");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void ShowNhomDanhBa(){
        System.out.println(new NhomDanhBaService().findAll());
    }

}
