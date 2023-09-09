package com.aula.aula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClienteFormController {

    private ClienteRepository clienteRepository;

    public ClienteFormController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/index")
    public String mostrarClientes(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll());
        return "index";
    }
}

