package com.caojx.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author caojx created on 2022/6/19 11:01 PM
 */
@Controller
public class IndexController {

    @GetMapping({"/","/index"})
    public String index() {
        return "index";
    }
}
