package example01;

public class FlowEx16 {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j==1) {
					break;
				}
				break;
			}
		}
	}
}
