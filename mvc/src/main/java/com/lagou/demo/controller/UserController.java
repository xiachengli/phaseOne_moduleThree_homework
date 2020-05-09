package com.lagou.demo.controller;

import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouController
@LagouRequestMapping("/user")
public class UserController {

    @LagouRequestMapping("/query01")
    @Security("yangchen")
    public void query01(HttpServletRequest request, HttpServletResponse response, String username) throws IOException {
        System.out.println("query01yangchen have authority");
        response.getWriter().write("query01yangchen have authority");
    }

    @Security("sansan")
    @LagouRequestMapping("/query02")
    public void query02(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        System.out.println("query02sansan have authority");
        response.getWriter().write("query02sansan have authority");

    }

    @Security("zhangsan")
    @LagouRequestMapping("/query03")
    public void query03(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        System.out.println("query03zhangsan have authority");
        response.getWriter().write("query03zhangsan have authority");
    }

}
