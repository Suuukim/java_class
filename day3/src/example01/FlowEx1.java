package example01;

public class FlowEx1 {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("x = 0일 때 참인것은 ? ");
		
		if(x == 0 ) { // 참 (true)
			System.out.println("x == 0");
		}
		
		if(x != 0) { // 거짓 (false)
			System.out.println("x != 0");
		}
		
		if( !(x == 0) ) { // 거짓 (false)
			System.out.println("!( x == 0)");
		}
		
		if( !(x != 0)) { // 참 (true)
			System.out.println("! (x != 0");
		}
		
	}
}
