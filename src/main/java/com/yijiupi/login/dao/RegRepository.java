package com.yijiupi.login.dao;

import com.yijiupi.login.entity.Reg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegRepository extends JpaRepository<Reg ,Long> {
    Reg findByUsernameAndPassword(String username,String password);

    public List<Reg> findById(Integer id);
}
