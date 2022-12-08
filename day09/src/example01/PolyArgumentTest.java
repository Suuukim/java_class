package example01;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TvProduct());	//Product p = new TvProduct();
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("현재 보너스 점수 : " + b.bonusPoint);
	
	}
}

class Product{
	int price;
	int bonusPoint;
	
	
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
//
//class TvProduct extends Product {
//	public TvProduct() {
//		super(100);
//	}
//	
//	@Override
//	public String toString() {
//		return "TvProduct";
//	}
//}
//
//class ComputerProduct extends Product{
//	public ComputerProduct() {
//		super(200);
//	}
//	
//	@Override
//	public String toString() {
//		return "ComputerProduct";
//	}
//}


class Buyer{		// 고객, 물건을 사는 사람
	int money = 1000;	//보유 금액
	int bonusPoint = 0;	//보너스 금액

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매하였습니다.");
	}
}


