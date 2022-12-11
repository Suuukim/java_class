package example02;

public class GameUnitTest {
	public static void main(String[] args) {
//		GameUnit gu = new GameUnit();
//		Marine n1 = new Marine();
//		Marine n2 = new Marine();
//		Tank t = new Tank();
//		DropShip d = new DropShip();
		
//		n1.move(1, 1);
//		n2.move(1, 1);
//		t.move(1, 1);
//		d.move(1, 1);
		
		GameUnit[] group = new Marine[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new DropShip();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(1, 1);
		}
		
		//위처럼 GameUnit배열을 만들어서 Marine 20명 생산.
		GameUnit[] marineGroup = new GameUnit[20];
		for(int i=0;i<marineGroup.length;i++) {
			marineGroup[i] = new Marine();
		}
		
		/*
		 * 위 코드는 공통조상인 GameUnit클래스 타입의 참조변수 배열을 통해서
		 * 서로 다른 종류의 인스턴스를 하나의 묶음으로 다룰 수 있다는 것을 보여주기 위한 것이다.
		 * 다형성에서 배웠듯이 조상클래스의 참조변수로 자손클래스의 인스턴스를 참조하는 것이 가능하기 때문에
		 * 이처럼 조상클래스타입의 배열에 자손클래스의 객체(인스턴스)를 담을 수 있는 것이다.
		 * 여기서 호출되는 move(1,1)은 자손클래스에서 재정의된 메소드가 호출되는 것이다.
		 */
	}
}
