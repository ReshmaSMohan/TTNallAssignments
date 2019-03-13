package events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CustomCloseEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("*********Close event************");
    }
}