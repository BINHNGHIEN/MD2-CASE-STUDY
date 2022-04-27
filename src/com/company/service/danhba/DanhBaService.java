package com.company.service.danhba;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.DanhBa;

import java.util.List;

public class DanhBaService implements IDanhBa{
    public static String PATH_DANHBA= ConfigReadAndWriteFile.PATH+ "danhba.txt";

    public static List<DanhBa> danhBaList= new ConfigReadAndWriteFile<DanhBa>().readFromFile(PATH_DANHBA);

    @Override
    public List<DanhBa> findAll() {
        new ConfigReadAndWriteFile<DanhBa>().writeToFile(PATH_DANHBA,danhBaList);
        return danhBaList;
    }

    @Override
    public void save(DanhBa danhBa) {
        danhBaList.add(danhBa);


    }

    @Override
    public DanhBa findById(int id) {
        return null;
    }

    @Override
    public DanhBa edit(int id, String name, String gioitinh, int sodienthoai, String diachi) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == danhBaList.get(i).getId()){
                danhBaList.get(i).setName(name);
                danhBaList.get(i).setGioitinh(gioitinh);
                danhBaList.get(i).setSodienthoai((int) sodienthoai);
                danhBaList.get(i).setDiachi(diachi);
            }
        }
        new ConfigReadAndWriteFile<DanhBa>().writeToFile(PATH_DANHBA, danhBaList);
        return null;
    }


    @Override
    public DanhBa deleteById(int id) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == danhBaList.get(i).getId()){
                danhBaList.remove(i);
            }
        }
        new ConfigReadAndWriteFile<DanhBa>().writeToFile(PATH_DANHBA, danhBaList);
        return null;
    }

    @Override
    public DanhBa search(int id) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == danhBaList.get(i).getId()){
                System.out.println(danhBaList.get(i));
            }
        }
        return null;
    }
}
