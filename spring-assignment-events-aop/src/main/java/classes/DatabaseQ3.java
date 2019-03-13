package classes;

import events.CustomConnectEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class DatabaseQ3 implements ApplicationEventPublisherAware {
    private Integer port;
    private String name;
    private ApplicationEventPublisher applicationEventPublisher;
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect(){
        CustomConnectEvent customConnectEvent=new CustomConnectEvent(this);
        applicationEventPublisher.publishEvent(customConnectEvent);
        System.out.println("connecting database");
    }

    @Override
    public String toString() {
        return "DatabaseQ3{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
