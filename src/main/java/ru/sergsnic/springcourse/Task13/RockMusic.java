package ru.sergsnic.springcourse.Task13;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Alisa - The sky of the Slavs";
    }
}
