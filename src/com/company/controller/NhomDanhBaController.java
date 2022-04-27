package com.company.controller;

import com.company.model.NhomDanhBa;
import com.company.service.nhomdanhba.NhomDanhBaService;

import java.util.List;

public class NhomDanhBaController {
    NhomDanhBaService nhomDanhBaService= new NhomDanhBaService();
    public List<NhomDanhBa> showNhomDanhBa(){
        return nhomDanhBaService.findAll();
    }

    public void createNhomDanhBa( NhomDanhBa nhomDanhBa){
        nhomDanhBaService.save(nhomDanhBa);
        nhomDanhBaService.findAll();
    }

    public  NhomDanhBa findById( int id){
        return nhomDanhBaService.findById(id);
    }
}
