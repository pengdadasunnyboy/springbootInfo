package com.yijiupi.login.service.impl;

import com.yijiupi.login.dao.EmpRepository;
import com.yijiupi.login.entity.Emp;
import com.yijiupi.login.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
  实现员工的service接口
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepository empRepository;

    // 通过名字和密码进行登陆
    @Override
    public Emp getEmp(String name, String password) {
          Emp emp=empRepository.findByNameAndPassword(name,password);
        return emp;
    }

    // 保存用户
    @Override
    public Emp save(Emp emp) {
        empRepository.save(emp);
        return emp;
    }

}
