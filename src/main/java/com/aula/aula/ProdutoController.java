package com.aula.aula;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    @GetMapping
    public Collection<Produto> getProdutoProduto() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        System.out.println(produto);
        produtoRepository.save(produto);
        return produto;
    }
    @PutMapping
    public Produto alterarProduto(@RequestBody Produto produto) {
        System.out.println(produto);
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping
    public void removerProduto(@RequestBody Produto produto) {
        System.out.println(produto);
        produtoRepository.delete(produto);
    }
}
