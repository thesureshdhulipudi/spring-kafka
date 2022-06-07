package com.kafka.kafkastreams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class OrderKafkaProducerService {

	private static final String KAFKA_TOPIC = "order-topic";

	private final StreamBridge streamBridge;

	@Autowired
	public OrderKafkaProducerService(StreamBridge streamBridge) {
		this.streamBridge = streamBridge;

	}

	public String doOrder(Order order) {
		if (order.getQuantity() == 0) {
			order.setStatus("FAILED");
		} else {
			order.setStatus("SUCCESS");
		}
		streamBridge.send(KAFKA_TOPIC, order);
		return order.getStatus();
	}
}
