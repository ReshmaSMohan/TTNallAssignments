package events;

import org.springframework.context.ApplicationEvent;

public class CustomConnectEvent extends ApplicationEvent {

    public CustomConnectEvent(Object source) {
        super(source);
    }
}
