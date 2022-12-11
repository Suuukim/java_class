package example01;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TvProduct());	// Product p = new TvProduct();
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("현재 보너스 점수 : " + b.bonusPoint);
	
		b.buy(new ComputerProduct());	// Product p = new ComputerProduct();
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("현재 보너스 점수 : " + b.bonusPoint);
		
		b.summary();
		
//		b.buy(new AudioProduct());
//		System.out.println("현재 남은 돈 : " + b.money);
//		System.out.println("현재 보너스 점수 : " + b.bonusPoint);
	
			
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
	int money = 1000;	//보유 금액
	int bonusPoint = 0;	//보너스 금액
	Product[] item = new Product[10];
	int i = 0;
	
	
//	void buy(TvProduct tv) {
//		if(money < tv.price) {
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		money -= tv.price;
//		bonusPoint += tv.bonusPoint;
//		System.out.println(tv + "을/를 구매하였습니다. ");
//	}
//	
//	void buy(ComputerProduct pc) {
//		if(money < pc.price) {
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		money -= pc.price;
//		bonusPoint += pc.bonusPoint;
//		System.out.println(pc + "을/를 구매하였습니다. ");
//	}
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구매하였습니다.");
	}	
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length;i++) {
			if(item[i] == null) {
				break;
			}
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구매하신 물픔의 총 금액 : " + sum);
		System.out.println("구매하신 제품 목록 : " + itemList);
	}
}




