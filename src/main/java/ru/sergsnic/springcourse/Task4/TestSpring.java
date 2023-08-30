package ru.sergsnic.springcourse.Task4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sergsnic.springcourse.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask4.xml");
        Music musicBean = context.getBean("musicBean", Music.class);
        System.out.println(musicBean.getSong());
    }
}
