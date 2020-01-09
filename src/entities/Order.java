package entities;

import java.util.Date;

import enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	// Criação do Construtor padrão e o construtor com argumentos.
	public Order() {
	}
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	// Gerar Getters e Setters
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	

}
