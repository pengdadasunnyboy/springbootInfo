package com.yijiupi.login.dao;

import com.yijiupi.login.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

/*
  员工dao接口
 */
public interface EmpRepository extends JpaRepository<Emp,Long> {

    // 通过名字和密码进行查找
    Emp findByNameAndPassword(String name,String password);

}
