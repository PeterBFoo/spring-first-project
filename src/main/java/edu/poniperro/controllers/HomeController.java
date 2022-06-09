package edu.poniperro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "redirect:/app/index";
        // return "forward:/app/index" Para redirigir a este endpoint sin mostrar la ruta
    }
}
