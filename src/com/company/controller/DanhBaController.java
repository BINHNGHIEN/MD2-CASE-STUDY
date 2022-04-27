package com.company.controller;

import com.company.model.DanhBa;
import com.company.service.danhba.DanhBaService;

import java.util.List;

public class DanhBaController {
    DanhBaService danhBaService= new DanhBaService();


    public List<DanhBa> showDanhBa(){
        return danhBaService.findAll();
    }

    public void createDanhBa(DanhBa danhBa){
        danhBaService.save(danhBa);
        danhBaService.findAll();
    }

    public void editDanhBa(int id, String name, String gioitinh, int  sodienthoai, String diachi){
        danhBaService.edit(id,name,gioitinh,sodienthoai,diachi);
    }

    public void deleteByIDDanhBa(int id){
        danhBaService.deleteById(id);
    }
    public void searchByIDDanhBa(int id) {
        danhBaService.search(id);
    }

}
