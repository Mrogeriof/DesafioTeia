package com.desafio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.helpers.StringHelper;
import com.desafio.model.ParametrosEntrada;
import com.desafio.model.ProcessamentoString;

@RestController
@RequestMapping("/api/manipulacao-string")
public class ManipulacaoStringController {    
    @PostMapping
    public ResponseEntity processamentoString(@RequestBody ParametrosEntrada parametrosEntrada){
        ProcessamentoString processamentoString = new ProcessamentoString();
        StringHelper auxiliar = new StringHelper();
        if(!parametrosEntrada.getTexto().isEmpty()){
            processamentoString.setPalindromo(auxiliar.testaPalindromo(parametrosEntrada.getTexto()));
            processamentoString.setOcorrenciaCaracteres(auxiliar.contaOcorrenciasCaractere(parametrosEntrada.getTexto()));
            return ResponseEntity.ok(processamentoString);    
        }
        return ResponseEntity.ok("String vazia.");
    }
}
