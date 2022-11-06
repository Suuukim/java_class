package example01;

public class VarEx3 {
	public static void main(String[] args) {
		// final
		int number = 0;
		number = 4;
		
		final int MAX_NUMBER = 100;	//상수명은 대문자로, 여러 단어를 이름으로 사용할 시 _사용
		System.out.println("상수 : " + MAX_NUMBER);
//		MAX_NUMBER = 200;		에러!! 상수로 선언된 값은 변경할 수 없다.
		
		
	}
}
