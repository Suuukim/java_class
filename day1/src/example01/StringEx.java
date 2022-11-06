package example01;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";	// "Java"	문자열 + 문자열 => 연결
		System.out.println(name);
		
		String str = name + 1.8;	// "Java" + 1.8
		System.out.println(str);
	
		/*
		 * String str = name + 1.8
		 * 		  str = "Java" + 1.8
		 * 		  str = "Java" + "1.8"
		 * 		  str = "Java1.8"
		 */
		
		System.out.println(7 + "");	// 7
		System.out.println("" + 7);	// 7
		System.out.println(7 + 7 + "");	//	14 	-> 문자열
		System.out.println("" + 7 + 7);	//	77	-> 문자열
	}
}
