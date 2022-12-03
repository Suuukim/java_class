package example04;

public class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x = 200;
	
	@Override
	void method() {
		System.out.println("child Method");
	}
	
	void method1() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}
