//package com.matrix.example.demo.controller;
//
//import com.matrix.example.demo.dao.entity.login.UserEntity;
//import com.matrix.example.demo.model.UserDto;
//import com.matrix.example.demo.service.login.SecurityService;
//import com.matrix.example.demo.service.login.UserService;
//import com.matrix.example.demo.validator.UserValidator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class LoginController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private UserValidator userValidator;
//    @Autowired
//    private SecurityService securityService;
//
//    @GetMapping("/login")
//    public String login(Model model, String error, String logout) {
//        if (securityService.isAuthenticated()) {
//            return "redirect:/";
//        }
//
//        if (error != null) {
//            model.addAttribute("error", "Invalid username or password,please verify your credentials.");
//        }
//
//        if (logout != null)
//            model.addAttribute("message", "Login successful.");
//
//        return "login";
//    }
//
//    @GetMapping("/registration")
//    public String registration(Model model) {
//        if (securityService.isAuthenticated()) {
//            return "redirect:/";
//        }
//        model.addAttribute("userForm", new UserEntity());
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String registration(@ModelAttribute("userForm") UserDto userForm, BindingResult bindingResult) {
//        userValidator.validate(userForm, bindingResult);
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//        userService.save(userForm);
//        securityService.autoLogin(userForm.getUsername(), userForm.getPassword());
//        return "redirect:/";
//    }
//
//    @GetMapping({"/"})
//    public String welcome(Model model) {
//        return "welcome";
//    }
//
//
//    @GetMapping("/access-denied")
//    public String showAccessDenied() {
//
//        return "accessDenied";
//
//    }
//
//}