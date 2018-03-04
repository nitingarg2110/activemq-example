package com.nitin.activemq.activemqeaxample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nitin.activemq.activemqeaxample.producer.Producer;

@SpringBootApplication
public class ActivemqEaxampleApplication {

	@Autowired
	Producer producer;

	public static void main(String[] args) {
		SpringApplication.run(ActivemqEaxampleApplication.class, args);
	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}

}
