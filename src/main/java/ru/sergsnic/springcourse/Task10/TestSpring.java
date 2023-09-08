package ru.sergsnic.springcourse.Task10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask10.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }
}
