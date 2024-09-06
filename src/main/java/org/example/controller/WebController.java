package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private UserService userService;

    // Display the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());  // Add a new User object to the model
        return "register";  // Return the Thymeleaf template name (register.html)
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        userService.saveUser(user);  // Save the user using the service
        model.addAttribute("message", "User registered successfully");  // Add a success message
        return "login";  // Redirect to the login page or show the registration confirmation page
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";  // Return the Thymeleaf template name (login.html)
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());  // Add the list of users to the model
        return "users";  // Return the Thymeleaf template name (users.html)
    }
}
