package com.nitin.activemq.activemqeaxample.listener;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nitin.activemq.activemqeaxample.model.SeoEvent;

@Component
public class Consumer {

	/*
	 * @Autowired private KieContainer kieContainer;
	 */

	private String serviceName;

	@JmsListener(destination = "standalone.queue", containerFactory = "jsaFactory")
	public void consumer(SeoEvent seoEvent) {
		System.out.println("Recieved Message " + seoEvent);
		/*
		 * KieSession kieSession = kieContainer.newKieSession();
		 * kieSession.setGlobal("serviceName", serviceName);
		 * kieSession.insert(seoEvent); kieSession.fireAllRules(); kieSession.dispose();
		 */

		KieServices ks = KieServices.Factory.get();

		KieContainer kContainer = ks.getKieClasspathContainer();

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		kSession.insert(seoEvent);
		kSession.setGlobal("serviceName", serviceName);
		kSession.fireAllRules();


		System.out.println("Service Name " + "serviceName");

	}

}
