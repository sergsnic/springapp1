package ru.sergsnic.springcourse.Task10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer musicPlayer;
    private final int ID = 1;
@Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{id: " + ID + " " + musicPlayer.playMusic() +"}";
    }
}
