package com.dsi.datatables.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentView {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
