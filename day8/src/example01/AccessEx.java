package example01;

public class AccessEx {
	public static void main(String[] args) {
		Access ac = new Access();
		System.out.println(ac.publicVar);
		System.out.println(ac.protectedVar);
		System.out.println(ac.defaultVar);
//		System.out.println(ac.privateVar);	
		//pirvate은 같은 클래스에서만 접근 가능.
	}
}
