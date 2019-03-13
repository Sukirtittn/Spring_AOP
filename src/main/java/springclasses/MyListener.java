package springclasses;

import org.springframework.context.ApplicationListener;
import springclasses.MyCustomEvent;

public class MyListener implements ApplicationListener<MyCustomEvent> {
    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        System.out.println();
        System.out.println("My implementation of listener for all spring events");
        System.out.println();
    }
}
