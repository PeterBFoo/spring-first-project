package edu.poniperro.service;

import edu.poniperro.domain.*;
import org.springframework.ui.Model;

import java.util.List;

import static java.util.Arrays.asList;

public class UsuarioService {

    public static Model perfil(Model model) {
        Usuario usuario = new Usuario("Andrés", "Moreno");
        usuario.setEmail("amoreno@gmail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: " + usuario.getName());
        return model;
    }

    public static Model listar(Model model) {
        List<Usuario> usuarios = asList(new Usuario("Alejandro", "Guzmán", "aguzman@gmail.com"),
                new Usuario("Ron", "Wheaslie", "wheaslie@gmail.com"),
                new Usuario("Ariel", "Aguilar", "ariel@gmail.com"));

        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        return model;
    }

}
