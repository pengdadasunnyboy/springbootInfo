package com.yijiupi.login;

import com.yijiupi.login.entity.Emp;
import com.yijiupi.login.service.EmpService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginApplicationTests {

	@Autowired
	private EmpService empService;

    // 测试注册
	@Test
	public void save(){
		Emp emp=new Emp();
		emp.setAge(22);
		emp.setName("易酒批123");
		emp.setPassword("123456");
		emp.setSex("女");
	    empService.save(emp);
	}

	// 测试登陆
	@Test
	public void  getEmp(){
		Emp emp=empService.getEmp("妲己","123456");
		Assert.assertEquals(new Integer(22), emp.getAge());
	}

}
