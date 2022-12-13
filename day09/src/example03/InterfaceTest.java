package example03;

public class InterfaceTest {
	A a = new A();
	a.methodA(new B());
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