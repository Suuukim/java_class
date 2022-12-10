package example01;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TvProduct());
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("");
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

class TvProduct extends Product{
	public TvProduct() {
		super(100); 
	}
	
	@Override
	public String toString() {
		  return "TvProduct";
	}
}

class ComputerProduct extends Product{
	public ComputerProduct() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "ComputerProduct";
	}
}

class Buyer{			//고객, 물건을 사는 사람
	int money = 10000;	//보유 금액
	int bonusPoint = 0;	//보너스 금액
	
	void buy(TvProduct tv) {
		if(money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= tv.price;
		bonusPoint += tv.bonusPoint;
		System.out.println(tv + "을/를 구매하였습니다. ");
	}
	
}




