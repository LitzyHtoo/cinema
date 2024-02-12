package com.cinema.cinema.controllers;

import com.cinema.cinema.daos.StaffDao;
import com.cinema.cinema.models.Admin;
import com.cinema.cinema.models.Staff;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StaffController {
    @Autowired
    StaffDao staffDao;

    @GetMapping("staffcreate")
    public ModelAndView staffGet(){
        return new ModelAndView("/staff/staffcreate","staff",new Staff());
    }

    @PostMapping("staffcreate")
    public ModelAndView staffPost(@Valid @ModelAttribute("staff") Staff staff, BindingResult error){
        if (error.hasErrors()) {
            System.out.println(error);
            return new ModelAndView("/staff/staffcreate", "staff", staff);
        }
        staffDao.save(staff);
        return new ModelAndView("","staff",new Staff());    }
}
