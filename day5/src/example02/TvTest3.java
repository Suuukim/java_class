package example02;

public class TvTest3 {
	public static void main(String[] args) {
		//객체배열
		Tv[] tvArr = new Tv[3];
		//int[] arr = new int[4];
		System.out.println("tvArr.length : " + tvArr.length);	//3
//		System.out.println("arr.length : " + arr.length);	//4
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = 1 + 10;
		}
		/*
		 * tvArr[0] = new Tv();
		 * tvArr[1] = new Tv();
		 * tvArr[2] = new Tv();
		 */
		
	}
}
