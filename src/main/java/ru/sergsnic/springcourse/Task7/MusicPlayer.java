package ru.sergsnic.springcourse.Task7;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println(name);
        for (Music song: musicList) {
            System.out.println("Playing: " + song.getSong());
            System.out.println("Volume" + volume);
        }

    }
}
