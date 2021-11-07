package com.example.workflow.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component("TimeoutDelegate")
public class TimeoutDelegate implements JavaDelegate {

    Logger logger = LoggerFactory.getLogger(TimeoutDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws RuntimeException {

//        String var1 = delegateExecution.getVariable("nome").toString();
//        delegateExecution.setVariable("nome", "TimeoutDelegate chegou --> " + var1);

        var timeoutDuration = delegateExecution.getVariable("timeoutDuration").toString();
        logger.info("-------------> timeoutDuration: "+timeoutDuration+" <---------------");
        logger.info("-------------> Deu timeout <---------------");

    }
}