package com.yijiupi.login.controller;

import com.yijiupi.login.entity.Reg;
import com.yijiupi.login.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class RegController {
    @Autowired
    private RegService regService;

    @RequestMapping("/")
    public String Index(){
        return "index";
    }

    @RequestMapping("/logins")
    public String getReg(@RequestParam String username,
                         @RequestParam String password,
                         HttpSession session,
                         RedirectAttributes attributes){
        Reg reg = regService.getReg(username,password);
        if (reg != null){
            reg.setPassword(null);
            session.setAttribute("reg",reg);
            return "index";
        }else {
            attributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:";
        }
    }

    @RequestMapping("/toregister")
    public String register(){
        return "register";
    }

    @RequestMapping("/register")
    public String save(Reg reg){
        regService.save(reg);
        return "success";
    }


}
