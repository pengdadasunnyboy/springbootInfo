package com.yijiupi.login.controller;

import com.yijiupi.login.entity.Emp;
import com.yijiupi.login.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpSession;

/*
 员工controller层
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/indexlogin")
    public String loginIndex(){
        return  "login";
    }

    @RequestMapping("/test")
    public String testIndex(){
        return  "Test";
    }

    // 员工登陆
    @RequestMapping("/login")
    public String getEmp(@RequestParam String name,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes) {
        Emp emp = empService.getEmp(name,password);
        if (emp != null) {
            emp.setPassword(null);
            session.setAttribute("emp", emp);
            return "index";
        }else{
            attributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:";
        }
    }

    // 进入注入页面
    @RequestMapping("/toRegist")
    public String insert() {
        return "regist";
    }

    // 保存注册信息
    @RequestMapping("/regist")
    public String save(Emp emp) {
        empService.save(emp);
        return "success";
    }

}
