package com.nitin.activemq.activemqeaxample.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitin.activemq.activemqeaxample.model.SeoEvent;

@RestController
@RequestMapping("/rest/publish")
public class Producer {

	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired
	Queue queue;

	@GetMapping("/{message}")
	public String publish(@PathVariable("message") final SeoEvent seoEvent) {
		jmsTemplate.convertAndSend(queue, seoEvent);

		return "Published Successfully";

	}

}
