package org.project.spring.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller 
@RequestMapping("/")
public class PageController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "welcome";
    }
}
