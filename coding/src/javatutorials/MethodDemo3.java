package javatutorials;

public class MethodDemo3 {
	public static void numbering() {
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	
	//재활용, 코드량감소, 유지보수유리.
	public static void main(String[] args) {
		numbering();
		numbering();
		numbering();
		numbering();
		numbering();
	}
}
