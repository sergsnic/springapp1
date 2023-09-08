package ru.sergsnic.springcourse.Task10;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Alisa - The sky of the Slavs";
    }
}
