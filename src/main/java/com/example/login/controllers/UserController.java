package com.example.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.login.repositories.AppUserRepository;


@Controller
public class UserController {

    @Autowired
    private AppUserRepository repo;

    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("users", repo.findAll());
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String userDetails(@PathVariable int id, Model model) {
        model.addAttribute("user", repo.findById(id).orElse(null));
        return "detail";
    }

    @GetMapping("/admin")
    public String adminPanel(Model model) {
        model.addAttribute("users", repo.findAll());
        return "admin";
    }
}
