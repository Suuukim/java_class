package example01;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수를 입력하세요 > ");
		score = sc.nextInt();
		
		switch(score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';
		}
		System.out.println("당신의 학점 : " + grade);
	}
}

/* 
 * 0 ~ 10
 * 10 ~ 19 : 1
 * 20 ~ 29 : 2
 * 90 ~ 99 : 9
*/