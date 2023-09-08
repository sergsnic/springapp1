package ru.sergsnic.springcourse.Task9;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Alisa - The sky of the Slavs";
    }
}
