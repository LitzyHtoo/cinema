package com.cinema.cinema.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class PageController {

    @GetMapping("login")
    public String login(){
        return "/login";
    }
    @GetMapping("post")
    public String loginPost(){


        return "";
    }
}
