package edu.poniperro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vars")
public class PathVariables {

    @ModelAttribute("titulo")
    public String titulo(Model model) {
        return "Recibir params de la ruta (@PathVariable)";
    }

    @GetMapping("/{text}")
    public String pathVars(@PathVariable String text, Model model) {
        model.addAttribute("var", "El texto enviado es: " + text);
        return "pathVar/ver";
    }
}
