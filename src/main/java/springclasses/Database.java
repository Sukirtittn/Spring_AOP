package springclasses;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Database implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    private int port;
    private String name;

    public Database() {
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    public Database(int port, String name) {
        this.port = port;
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect() {
        MyCustomEvent event = new MyCustomEvent(this);
        applicationEventPublisher.publishEvent(event);
        System.out.println("connected");
    }

    public void methodWithIntArg(int a) {
        System.out.println("method with 1 int arg");
    }

    public void display() {
        System.out.println("display method");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
