package com.example.workflow.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component("EnvioDelegate")
public class EnvioDelegate implements JavaDelegate {

    Logger logger = LoggerFactory.getLogger(EnvioDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws RuntimeException {

//        String var1 = delegateExecution.getVariable("nome").toString();
//        delegateExecution.setVariable("nome", "EnvioDelegate chegou --> " + var1);

        logger.info("-------------> EnvioDelegate Chegou no fim <---------------");

    }
}