package ru.sergsnic.springcourse.Task13;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialized");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destruct");
    }

    public void playMusic() {
        Random random = new Random();
        int indexArraylist = random.nextInt(musicList.size());
        System.out.println("Playing: " + musicList.get(indexArraylist).getSong() +
                ", Name: " + name + ", Volume: " + volume);
    }
}
