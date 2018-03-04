package com.nitin.activemq.activemqeaxample.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitin.activemq.activemqeaxample.model.SeoEvent;

@RestController
@RequestMapping("/rest")
public class Producer {

	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired
	Queue queue;

	@PostMapping("/publish")
	public String publish(@RequestBody final SeoEvent seoEvent) {
		jmsTemplate.convertAndSend(queue, seoEvent);

		return "Published Successfully";

	}

}
