package com.wedsonxse.valueEmitter.dispatcher;

import com.wedsonxse.valueEmitter.clients.DeliverClient;
import com.wedsonxse.valueEmitter.factory.TemperatureFactory;
import org.springframework.boot.autoconfigure.amqp.AbstractRabbitListenerContainerFactoryConfigurer;

import java.util.ArrayList;
import java.util.List;

public class RequestDispatcher {
    private List<DeliverClient> clients;
    private TemperatureFactory factory;

    public RequestDispatcher(TemperatureFactory factory){
        this.clients = new ArrayList<DeliverClient>();
        this.factory = factory;
    }

    public void attachDeliverClient(DeliverClient client){
        this.clients.add(client);
    }
}
