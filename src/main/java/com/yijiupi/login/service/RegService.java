package com.yijiupi.login.service;

import com.yijiupi.login.entity.Reg;

public interface RegService {

    Reg getReg(String username,String password);

    Reg save(Reg reg);
}
