package entities;

public class Product {
	//1. declaração de variáveis
	private String name;
	private Double price;
	
	//2. Construtor padrão
	
	public Product() {
	}
	//3. construtor com argumentos
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	// 4. Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
