package events;

import org.springframework.context.ApplicationListener;

public class CustomConnectEventListener implements ApplicationListener<CustomConnectEvent> {

    @Override
    public void onApplicationEvent(CustomConnectEvent event) {
        System.out.println("##custom Event on connect##"+event.getClass());
    }
}
