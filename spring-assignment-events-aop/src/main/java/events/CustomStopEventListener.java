package events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CustomStopEventListener implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("*********Stop event************");
    }
}