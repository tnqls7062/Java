package java0430_inheritance.part11;

public class Cloth {
private String brand;
private String kind;
private int price;

public Cloth (String brand, String kind, int price) {
	this.brand=brand;
	this.kind=kind;
	this.price=price;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getKind() {
	return kind;
}

public void setKind(String kind) {
	this.kind = kind;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
	public void display() {
		System.out.printf("%d %d %s\n",brand,kind,price);
	}
}

