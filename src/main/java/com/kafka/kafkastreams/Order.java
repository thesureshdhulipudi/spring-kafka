package com.kafka.kafkastreams;

import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = -5065374363573887717L;
	private Integer id;
	private String item;
	private Integer quantity;
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}