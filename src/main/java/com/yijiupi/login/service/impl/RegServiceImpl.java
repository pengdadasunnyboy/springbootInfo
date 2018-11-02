package com.yijiupi.login.service.impl;

import com.yijiupi.login.dao.RegRepository;
import com.yijiupi.login.entity.Reg;
import com.yijiupi.login.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegServiceImpl implements RegService {
    @Autowired
    private RegRepository regRepository;

    @Override
    public Reg getReg(String username,String password){
        Reg reg = regRepository.findByUsernameAndPassword(username,password);
        return reg;
    }
    @Override
    public Reg save(Reg reg){
        regRepository.save(reg);
        return reg;
    }
}
