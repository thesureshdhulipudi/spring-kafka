package com.kafka.kafkastreams;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderKafkaConsumer {

	@Bean
	public Consumer<KStream<String, Order>> orderService() {
		return kstream -> kstream.foreach((key, order) -> {
			if ("SUCCESS".equals(order.getStatus())) {
				System.out.println("Order Success");
			} else {
				System.out.println("Order Failed");
			}
		});

	}

}
