package com.milibreria.libreria;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model) {

        String mensajee = "probando el model!!!";
        model.addAttribute("mensaje", mensajee);
        return "index";
    }
}
