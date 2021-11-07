package com.example.workflow.delegate;

import com.example.workflow.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Slf4j
@Component("ConfiguraCamundaDelegate")
public class ConfiguraCamundaDelegate implements JavaDelegate {



    final long      SEGUNDOS        = ( 50 );
    final long      MILISSEGUNDOS   = ( 1000 * SEGUNDOS );
    final Duration  DURATION        = Duration.ofMillis( MILISSEGUNDOS );
    final long      HORAS           = DURATION.toHours();
    final long      MINUTOS         = DURATION.toMinutes();



    @Override
    public void execute(DelegateExecution delegateExecution) throws RuntimeException {


        //log.info("-------------> formatDuration:  " + Utils.convertToTimeDuration(MILISSEGUNDOS) + "<---------------");


        log.info("-------------> Duration " + DURATION + "<---------------");

        try{
            log.info("-------------> Esperando o Sllep<---------------");
            //Thread.sleep(MILISSEGUNDOS);
        }catch (Exception erro){
            log.info("Deu merda!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        String var1 = delegateExecution.getVariable("nome").toString();
        delegateExecution.setVariable("nome", "Teste de Camunda adicionando a variável --> " + var1);

        delegateExecution.setProcessBusinessKey("01234");

        delegateExecution.setVariable("timeoutDuration", DURATION.toString());

        log.info("-------------> HORAS:     "      + Long.toString(HORAS)           + " <---------------");
        log.info("-------------> MINUTOS:   "      + Long.toString(MINUTOS)         + " <---------------");
        log.info("-------------> SEGUNDOS:  "      + Long.toString(SEGUNDOS)        + " <---------------");
        log.info("-------------> MILISSEGUNDOS:  " + Long.toString(MILISSEGUNDOS)   + " <---------------");
        log.info("-------------> Duration:  "      + DURATION.toString()            + " <---------------");
        log.info("-------------> Pronto enviou <---------------");

    }
}
