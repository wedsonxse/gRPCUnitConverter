package com.wedsonxse.valueEmitter;

import com.wedsonxse.valueEmitter.clients.DeliverClient;
import com.wedsonxse.valueEmitter.clients.GRPCClient;
import com.wedsonxse.valueEmitter.clients.HttpClient;
import com.wedsonxse.valueEmitter.dispatcher.RequestDispatcher;
import com.wedsonxse.valueEmitter.factory.TemperatureFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueEmitterApplication {

	public static void main(String[] args) {

		// create vaues factory instance
		TemperatureFactory factory = new TemperatureFactory();

		// create client instances
		DeliverClient httpClient = new HttpClient();
		DeliverClient gRPCClient = new GRPCClient();

		// initialize requests dispatcher
		RequestDispatcher dispatcher = new RequestDispatcher(factory);
		dispatcher.attachDeliverClient(httpClient);
		dispatcher.attachDeliverClient(gRPCClient);
		
		//todo -> create dispatcher method to start application

		SpringApplication.run(ValueEmitterApplication.class, args);
	}

}
