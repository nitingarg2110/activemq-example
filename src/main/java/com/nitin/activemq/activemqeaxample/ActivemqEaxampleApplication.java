package com.nitin.activemq.activemqeaxample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nitin.activemq.activemqeaxample.producer.Producer;

@SpringBootApplication
public class ActivemqEaxampleApplication implements CommandLineRunner {

	@Autowired
	Producer producer;

	public static void main(String[] args) {
		SpringApplication.run(ActivemqEaxampleApplication.class, args);
	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}

	@Override
	public void run(String... args) throws Exception {
		/*SeoEvent event1 = new SeoEvent("Event1", "123", "MST", CallDirectionEnum.Inbound, EnviromentEnum.DEV,
				"localhost", BusinessDomainEnum.Customer, "SEO", MessageTypeEnum.EVENT, "abc");
		SeoEvent event2 = new SeoEvent("Event1", "123", "MST", CallDirectionEnum.Inbound, EnviromentEnum.DEV,
				"localhost", BusinessDomainEnum.Customer, "SEO", MessageTypeEnum.ASPECT, "abc");
		producer.publish(event1);
		producer.publish(event2);*/

	}
}
