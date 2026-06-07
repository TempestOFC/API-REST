package br.com.exemplo.gestaopessoas2026.controller;

import br.com.exemplo.gestaopessoas2026.exceptions.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteExcecoesController {

    @GetMapping("/teste/int/{v1}")
    public String testarErroInterno(@PathVariable String v1) {
        if ("erro".equalsIgnoreCase(v1)) {
            throw new RuntimeException("Exceção interna simulada");
        }
        return "OK - interno";
    }

    @GetMapping("/teste/bad/{v1}")
    public String testarBadRequest(@PathVariable String v1) {
        if ("invalido".equalsIgnoreCase(v1)) {
            throw new RequisicaoInvalidaException("Parâmetro inválido: " + v1);
        }
        return "OK - bad request";
    }

    @GetMapping("/teste/nao/{v1}")
    public String testarNaoAutorizado(@PathVariable String v1) {
        if ("negado".equalsIgnoreCase(v1)) {
            throw new AcessoNaoAutorizadoException("Acesso negado para o valor: " + v1);
        }
        return "OK - nao autorizado";
    }
}