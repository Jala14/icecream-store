package com.matrix.example.demo.controller;

import com.matrix.example.demo.dao.entity.login.UserEntity;
import com.matrix.example.demo.model.UserDto;
import com.matrix.example.demo.service.login.SecurityService;
import com.matrix.example.demo.service.login.UserService;
import com.matrix.example.demo.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("userForm")
    public UserDto userRegistrationDto() {
        return new UserDto();
    }

    @GetMapping
    public String showRegistrationPage(Model model) {
        model.addAttribute("userForm", new UserDto());
        return "registration";
    }


//    @GetMapping
//    public String showRegistrationForm() {
//        return "registration";
//    }


    @PostMapping
    public String registerUser(@ModelAttribute("userForm") UserDto userRegistrationDto) {
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";

    }

}

//@Controller
//@RequestMapping("/registration")
//public class UserRegistrationController {
//
//    private UserService userService;
//
//    public UserRegistrationController(UserService userService) {
//        super();
//        this.userService = userService;
//    }
//    @Autowired
//    private UserValidator userValidator;
//    @Autowired
//    private SecurityService securityService;
//
//    @GetMapping
//    public String registration(Model model) {
//        if (securityService.isAuthenticated()) {
//            return "redirect:/";
//        }
//        model.addAttribute("userForm", new UserEntity());
//        return "registration";
//    }

//    @PostMapping
//    public String registration(@ModelAttribute("userForm") UserDto userForm, BindingResult bindingResult) {
//        userValidator.validate(userForm, bindingResult);
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//        userService.save(userForm);
//        securityService.autoLogin(userForm.getUsername(), userForm.getPassword());
//        return "redirect:/";
//    }

//    @ModelAttribute("userForm")
//    public UserDto userRegistrationDto() {
//        return new UserDto();
//    }

//    @GetMapping
//    public String showRegistrationPage(Model model) {
//        model.addAttribute("userForm", new UserDto());
//        return "registration";
//    }
//
//
//
//    @GetMapping
//    public String showRegistrationForm() {
//        return "registration";
//    }
//
//
//    @PostMapping
//    public String registerUser(@ModelAttribute("userForm") UserDto userRegistrationDto) {
//        userService.save(userRegistrationDto);
//        return "redirect:/registration?success";
//
//    }
//
//
//}
