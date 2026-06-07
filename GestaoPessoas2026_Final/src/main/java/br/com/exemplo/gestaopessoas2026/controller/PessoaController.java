package br.com.exemplo.gestaopessoas2026.controller;

import br.com.exemplo.gestaopessoas2026.model.Pessoa;
import br.com.exemplo.gestaopessoas2026.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    @GetMapping
    public List<Pessoa> buscarTodas() {
        return service.buscarTodas();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa criar(@RequestBody Pessoa pessoa) {
        return service.criar(pessoa);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return service.atualizar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}