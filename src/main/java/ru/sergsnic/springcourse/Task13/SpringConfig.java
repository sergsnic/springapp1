package ru.sergsnic.springcourse.Task13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
@Scope("prototype")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    JazzMusic jazzMusic(){
        return new JazzMusic();
    }
    @Bean
    List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }
    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
