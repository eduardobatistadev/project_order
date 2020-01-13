package entities;

public class OrderItem {
	//1. declaração de variaveis
	private Integer quantity;
	private Double price;
	//2. construtor padrão
	public OrderItem() {
	}
	//3. construtor com argumentos
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	// 4. getters e setters
	public Integer getQuantity() {
		return quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
