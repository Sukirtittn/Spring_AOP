package springclasses;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                new ClassPathXmlApplicationContext("Spring-config.xml");
        configurableApplicationContext.start();
        System.out.println("Context started");

        Database database=configurableApplicationContext.getBean("database", Database.class);
        System.out.println(database);
        database.connect();

        configurableApplicationContext.stop();
        System.out.println("context stopped buut can be started again");

        configurableApplicationContext.close();
    }
}
