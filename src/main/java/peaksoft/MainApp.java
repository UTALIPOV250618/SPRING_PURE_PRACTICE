package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.IoC.MusicPlayer;
import peaksoft.testbean.ClassicalMusic;
import peaksoft.testbean.Music;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");


        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();



//        //Like in Hibernate: Customer customer = session.get(Customer.class,id);
//
//        //TestBean testbean = new TestBean("Ulukmyrza");
//        ClassicalMusic testBean = context.getBean("testBean", ClassicalMusic.class);
//
//        System.out.println(testBean.getName());
    }
}
