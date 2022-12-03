package example03;

public class InstancedfTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car istance");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object instace");
		}
	}
}
