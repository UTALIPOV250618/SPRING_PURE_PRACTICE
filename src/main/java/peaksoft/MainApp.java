package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.testbean.ClassicalMusic;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //Like in Hibernate: Customer customer = session.get(Customer.class,id);

        //TestBean testbean = new TestBean("Ulukmyrza");
        ClassicalMusic testBean = context.getBean("testBean", ClassicalMusic.class);

        System.out.println(testBean.getName());
    }
}
