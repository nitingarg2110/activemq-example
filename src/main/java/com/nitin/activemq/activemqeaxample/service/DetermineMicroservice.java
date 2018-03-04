package com.nitin.activemq.activemqeaxample.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitin.activemq.activemqeaxample.model.SeoEvent;

@Service
public class DetermineMicroservice {

	@Autowired
	private final KieContainer kieContainer;

	public DetermineMicroservice(KieContainer kieContainer) {
		super();
		this.kieContainer = kieContainer;
	}

	public SeoEvent getMicroServiceName(SeoEvent seoEvent) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(seoEvent);
		kieSession.fireAllRules();
		kieSession.dispose();
		return seoEvent;
	}

}
