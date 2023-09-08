package ru.sergsnic.springcourse.Task9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask9.xml");
        Music musicBean = context.getBean("rock", Music.class);
        System.out.println(musicBean.getSong());
    }
}
