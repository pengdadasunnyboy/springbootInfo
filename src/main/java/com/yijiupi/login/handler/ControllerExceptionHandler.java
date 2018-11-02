package com.yijiupi.login.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/*
  自定义错误页面
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHander(HttpServletRequest request, Exception e) throws Exception {
            ModelAndView mv=new ModelAndView();
            mv.addObject("url",request.getRequestURL());
            mv.addObject("exceptiion" ,e);
            mv.setViewName("error");
            return  mv;
        }

}
