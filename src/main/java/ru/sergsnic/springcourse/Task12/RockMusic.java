package ru.sergsnic.springcourse.Task12;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class RockMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialized");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destruct");
    }
    @Override
    public String getSong() {
        return "Alisa - The sky of the Slavs";
    }
}
