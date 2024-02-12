package com.cinema.cinema.controllers;

import com.cinema.cinema.daos.AdminDao;
import com.cinema.cinema.models.Admin;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @Autowired
    AdminDao adminDao;

    @GetMapping("admincreate")
    public ModelAndView adminGet(){
        return new ModelAndView("/admin/admincreate","admin",new Admin());
    }
    @PostMapping("admincreate")
    public ModelAndView adminPost(@Valid @ModelAttribute("admin")Admin admin, BindingResult error){
        if (error.hasErrors()) {
            System.out.println(error);
            return new ModelAndView("/admin/admincreate", "admin", admin);
        }
            adminDao.save(admin);
        return new ModelAndView("/admin/adminacc");
    }
}
