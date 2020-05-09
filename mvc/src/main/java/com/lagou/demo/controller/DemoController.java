package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouController
@LagouRequestMapping("/demo")
@Security({"yangchen","sansan"})
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param username
     * @return
     */
    @LagouRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        response.getWriter().write("/demo/query yangchen and sansan have authority");
    }

    @LagouRequestMapping("/query01")
    public void query01(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        response.getWriter().write("/demo/query01 yangchen and sansan have authority");
    }
}
