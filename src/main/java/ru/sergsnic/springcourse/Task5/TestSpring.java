package ru.sergsnic.springcourse.Task5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask5.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
