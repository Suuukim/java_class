package example01;

import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String[] args) {
		// 빈도수 구하기
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = (int)(Math.random() * numArr.length);// 값의 범위 : 0 ~ 9
		}
		System.out.println("배열의 요소 : " + Arrays.toString(numArr));
		System.out.println();
		
		for(int i=0;i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		
		for(int i=0;i<counter.length;i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}
}
