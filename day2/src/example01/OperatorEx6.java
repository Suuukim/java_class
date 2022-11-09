package example01;

public class OperatorEx6 {
	public static void main(String[] args) {
		boolean result = false;
		int i = 10;
		char ch = 'b';	//98
		
		result = ( i > 5);	//true
		System.out.println("(i > 5) : " + (i > 5));
		
		result = (i >= 9) && (i < -8);	//false
		System.out.println("( i >= 9) && ( i < -8) : " + result);
		
		result = (i >= 9) || (i < -8);	//true
		System.out.println("i >= 4 ) || (i < -8) : " + result);
		
		
		
	}
}
