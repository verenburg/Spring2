package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.*;

public class MusicPlayerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean2", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic2.getSong());

        /*MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1==musicPlayer2);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer2.setVolume(10);
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer2.getName());

        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();*/

        context.close();

    }

}
