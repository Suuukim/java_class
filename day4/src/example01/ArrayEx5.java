package example01;

public class ArrayEx5 {
	public static void main(String[] args) {
		// 총합과 평균 구하기
		int sum = 0;
		double average = 0.0;
		
		int[] score = {100,88,97,65,42};

		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		
		average = sum / (double)score.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}
}
