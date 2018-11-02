package com.yijiupi.login.service;

import com.yijiupi.login.entity.Emp;

/*
  员工service接口
 */
public interface EmpService {

    // 通过员工名和密码查找
    Emp getEmp(String name,String password);

    // 新增员工
    Emp save(Emp emp);

}
