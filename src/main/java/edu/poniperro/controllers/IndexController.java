package edu.poniperro.controllers;

import edu.poniperro.domain.Usuario;
import edu.poniperro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @Value("${texto.indexcontroller.perfil.titulo}")
    private String tituloPerfil;

    @Autowired
    UsuarioService userService;

    @RequestMapping(value = {"/", "", "/index", "/home"}, method = RequestMethod.GET)
    // @GetMapping(value = "/") -> Se puede hacer así con todos los otros tipos de envío
    // o recibo o simplemente indicando en el method = RequestMethod.x
    public String index (Model model) {
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index"; // el "index" se refiere al index.html que está dentro de resources/templates/
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        userService.perfil(model, tituloPerfil);
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        userService.listar(model);
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        return userService.poblarUsuarios();
    }

    // Distintas formas de ponerlo:

    /**
     * public String index (ModelMap model) {
     *         model.addAttribute("titulo", "Hola Spring Framework");
     *         return "index";
     *     }
     */

    /**
     * public ModelAndView index (ModelAndView mv) {
     *         mv.addObject("titulo", "Hola Spring Framework");
     *         mv.setViewName("index");
     *         return mv;
     *     }
     */

}
