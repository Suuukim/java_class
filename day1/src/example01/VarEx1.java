package example01;

public class VarEx1 {
	public static void main(String[] args) {
		// ������ ����� �ʱ�ȭ
		int x = 10;
		int y = 20;
		int tmp = 0;
		
//		System.out.println(x);
//		System.out.println(y);
		System.out.println("x = " + x);		// 10
		System.out.println("y = " + y);		// 20
		System.out.println("=========================");
		//���� + ���ڿ� ==> ���ڿ�
		//���ڿ�  + ���� ==> ���ڿ�
		//���ڿ� + ���ڿ� ==> ���ڿ�
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x = " + x);		// 20
		System.out.println("y = " + y);		// 10  
		System.out.println("tmp = " + tmp); // 10
	}
}
