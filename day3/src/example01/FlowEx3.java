package example01;

import java.util.Scanner;

public class FlowEx3 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) { // score < 90 && score >= 80
			grade = 'B';
		} else if(score >= 70) { // socre < 80
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점 : " + grade);
		
	}
}