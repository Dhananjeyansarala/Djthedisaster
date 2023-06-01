package Preparartion2;

public class Bookstore {
	private String name;
	private int price;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Bookstore(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bookstore [name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	

}
