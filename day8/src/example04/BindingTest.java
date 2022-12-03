package example04;

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x : " + p.x); //100
		p.method();	// Child
		System.out.println("c.x : " + c.x);	//200
		c.method();	// Child
	}	
}
