package com.company.service.nhomdanhba;

import com.company.model.DanhBa;
import com.company.model.NhomDanhBa;
import com.company.service.IServiceGeneric;

import java.util.List;

public interface INhomDanhBa extends IServiceGeneric<NhomDanhBa> {
    List<NhomDanhBa> findAll();
    void save(NhomDanhBa nhomDanhBa);

    NhomDanhBa findById(int id);

}
