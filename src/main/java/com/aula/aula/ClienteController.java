package com.aula.aula;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

// Create (POST) Read (GET) Update (PUT) Delete (DELETE)
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    @GetMapping // VERBO HTTP - GET
    public Collection<Cliente> getNomeCliente() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        clienteRepository.save(cliente);
        return cliente;
    }
    @PutMapping
    public Cliente alterarCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        clienteRepository.save(cliente);
        return cliente;
    }

    @DeleteMapping
    public void removerCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        clienteRepository.delete(cliente);
    }

}