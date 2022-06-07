package com.kafka.kafkastreams;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	private OrderKafkaProducerService orderKafkaProducerService;

	public OrderController(OrderKafkaProducerService orderKafkaProducerService) {
		this.orderKafkaProducerService = orderKafkaProducerService;
	}

	@PostMapping
	public String doOrder(@RequestBody Order order) {
		String status = orderKafkaProducerService.doOrder(order);
		return "Your Order " + status;
	}
}
