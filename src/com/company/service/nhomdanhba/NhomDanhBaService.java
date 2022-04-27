package com.company.service.nhomdanhba;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.DanhBa;
import com.company.model.NhomDanhBa;

import java.util.List;

public class NhomDanhBaService implements INhomDanhBa{
    public static String PATH_NHOMDANHBA= ConfigReadAndWriteFile.PATH+ "nhomdanhba.txt";
    public static List<NhomDanhBa> nhomDanhBaList= new ConfigReadAndWriteFile<NhomDanhBa>().readFromFile(PATH_NHOMDANHBA);
    @Override
    public List<NhomDanhBa> findAll() {
        new ConfigReadAndWriteFile<NhomDanhBa>().writeToFile(PATH_NHOMDANHBA,nhomDanhBaList);
        return nhomDanhBaList;
    }

    @Override
    public void save(NhomDanhBa nhomDanhBa) {
        nhomDanhBaList.add(nhomDanhBa);
    }

    @Override
    public NhomDanhBa findById(int id) {
        for ( int i=0;i<nhomDanhBaList.size();i++)
            if(id==nhomDanhBaList.get(i).getId()){
                return nhomDanhBaList.get(i);
            }
        return null;
    }
}
