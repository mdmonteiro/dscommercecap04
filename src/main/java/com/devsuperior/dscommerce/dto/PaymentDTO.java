package com.devsuperior.dscommerce.dto;

import java.time.Instant;

import com.devsuperior.dscommerce.entities.Payment;

public class PaymentDTO {

	private Long id;
	private Instant moment;

	public PaymentDTO() {

	}

	public PaymentDTO(Long id, Instant moment) {
		this.id = id;
		this.moment = moment;
	}

	public PaymentDTO(Payment payment) {
		id = payment.getId();
		moment = payment.getMoment();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

}
