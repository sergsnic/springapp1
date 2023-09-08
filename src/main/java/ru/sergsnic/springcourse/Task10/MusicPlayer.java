package ru.sergsnic.springcourse.Task10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public String playMusic(){
        return "Playing: " + music.getSong();
    }
}
