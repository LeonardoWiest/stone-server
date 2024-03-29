package com.github.leonardowiest.stone.server.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.leonardowiest.stone.server.api.AutenticacaoController;
import com.github.leonardowiest.stone.server.dto.AutenticacaoDTO;
import com.github.leonardowiest.stone.server.dto.RetornoAutenticacaoDTO;
import com.github.leonardowiest.stone.server.service.AutenticacaoService;

@RestController
public class AutenticacaoControllerImpl implements AutenticacaoController {

    @Lazy
    @Autowired
    AutenticacaoService autenticacaoService;

    @Override
    public RetornoAutenticacaoDTO realizarLogin(@RequestBody AutenticacaoDTO autenticacaoDTO) {
        return autenticacaoService.realizarLogin(autenticacaoDTO);
    }

}
