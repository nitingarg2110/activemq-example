package com.nitin.activemq.activemqeaxample.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nitin.activemq.activemqeaxample.model.SeoEvent;
import com.nitin.activemq.activemqeaxample.service.DetermineMicroservice;

@Component
public class Consumer {

	@Autowired
	private DetermineMicroservice determineService;

	public Consumer(DetermineMicroservice determineService) {
		super();
		this.determineService = determineService;
	}

	@JmsListener(destination = "standalone.queue", containerFactory = "jsaFactory")
	public void consumer(SeoEvent seoEvent) {
		System.out.println("Recieved Message " + seoEvent);
		
		determineService.getMicroServiceName(seoEvent).getMicroServiceName();
		
		System.out.println("Service Name:" + determineService.getMicroServiceName(seoEvent).getMicroServiceName());

	}

}
