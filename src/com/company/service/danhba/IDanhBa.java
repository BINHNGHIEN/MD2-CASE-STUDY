package com.company.service.danhba;

import com.company.model.DanhBa;
import com.company.service.IServiceGeneric;

public interface IDanhBa extends IServiceGeneric<DanhBa> {
    DanhBa findById(int id);
    DanhBa edit(int id, String name, String gioitinh,int sodienthoai,String diachi );
    DanhBa deleteById( int id);
    DanhBa search( int id);
}
