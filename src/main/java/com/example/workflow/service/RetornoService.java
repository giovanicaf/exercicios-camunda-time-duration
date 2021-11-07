package com.example.workflow.service;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RetornoService {
    @Autowired
    private RuntimeService runtimeService;

    public void respostaPostman(String Nome){
        try {
            runtimeService.createMessageCorrelation("Message_EventoPostmanConcluido")
                    .processInstanceBusinessKey("01234")
                    .setVariable("nome", "A mensagem do Postman Chegou!")
                    .correlate();
            log.error("A mensagem do Postman Chegou e o processo foi criado! ");
        }catch (Exception e){
            log.error("A mensagem chegou do Postman com erro! ");
        }
    }
}
