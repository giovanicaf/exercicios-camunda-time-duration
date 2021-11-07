package com.example.workflow.controler;

import com.example.workflow.service.RetornoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/retorno")
public class RetornoController {

    final long SEGUNDOS = ( 7 );
    final long MILISSEGUNDOS = (1000 * SEGUNDOS);

    @Autowired
    private RetornoService service;

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendToConsumer(@RequestBody String message){
        try{
            log.info("-------------> sendToConsumer chegou <---------------");
            //Thread.sleep(MILISSEGUNDOS);
        }catch (Exception erro){
            log.info(" sendToConsumer Deu merda!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        service.respostaPostman(message);
    }


}
