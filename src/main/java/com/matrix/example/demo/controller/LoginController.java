package com.matrix.example.demo.controller;
import com.matrix.example.demo.service.login.SecurityService;
import com.matrix.example.demo.service.login.UserService;
import com.matrix.example.demo.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private SecurityService securityService;

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (securityService.isAuthenticated()) {
            return "redirect:/";
        }

        if (error != null) {
            model.addAttribute("error", "Invalid username or password,please verify your credentials.");
        }

        if (logout != null)
            model.addAttribute("message", "Login successful.");

        return "login";
    }


    @GetMapping({"/"})
    public String welcome(Model model) {
        return "welcome";
    }


    @GetMapping("/access-denied")
    public String showAccessDenied() {

        return "accessDenied";

    }

}
