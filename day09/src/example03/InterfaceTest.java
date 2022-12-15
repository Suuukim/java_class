package example03;

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());	//a.methodA(B b); ==> B b = new B();
		a.methodA(new C() );
	}
	
}


class A{
	public void methodA(B b) {
		b.methodB();
	}
}

class B{
	public void methodB() {
		System.out.println("methodB() in B Class");
	}
}

class C{
	public void methodB() {
		System.out.println("methodB() in C Class");
	}
}

