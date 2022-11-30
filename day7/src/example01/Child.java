package example01;

public class Child extends Parent{

	/*
	 * Child(){
	 * 		super(){}
	 * }
	 */
	
	public static void main(String[] args) {
		Child c = new Child();
		c.x = 10;
		c.y = 20;
		c.hello();
		System.out.println("c.x : " + c.x);
		System.out.println("c.y : " + c.y);
		
	}
	@Override
	void hello() {
		System.out.println("child의 hell()메소드입니다.");
	}
}

class Parent{
	int x;
	int y;
	
	void hello() {
		System.out.println("parent의 hello() 메소드입니다.");
	}
}