package ru.sergsnic.springcourse.Task8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sergsnic.springcourse.Task7.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask8.xml");
        ClassicalMusic music = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(music.getSong());
        context.close();
    }
}
