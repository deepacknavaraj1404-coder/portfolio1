package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }

    @GetMapping("/skills")
    public String skills(Model model) {
        model.addAttribute("title", "Skills");
        return "skills";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("title", "Projects");
        return "projects";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact");
        return "contact";
    }
}
