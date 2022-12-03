package example02;

import example01.Access;

public class AccessEx2 extends Access{
	void method() {
		System.out.println(super.publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);
//		System.out.println(privateVar); 
	}
}

class AccessEx3{
	Access ac = new Access();
	int num = ac.publicVar;
//	int num1 = ac.protedctedVar;
}
