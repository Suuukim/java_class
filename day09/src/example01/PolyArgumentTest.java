package example01;

public class PolyArgumentTest {
	
}

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
