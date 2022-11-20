package day1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// 코인노래방
		
		int coin = 0;	// 코인
		int time = 0;	// 시간
		int service = 0;	//서비스
		int people = 0;	// 인원
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("코인을 입력하세요 > ");
		coin = sc.nextInt();
		System.out.print("시간을 입력하세요 > ");
		time = sc.nextInt();
		System.out.print("인원을 입력하세요 > ");
		people = sc.nextInt();
		System.out.print("서비스를 입력하세요 > ");
		
		System.out.println("입력한 코인 : " + coin + "개");
		System.out.println("입력한 시간 : " + time + "분");
		System.out.println("입력한 인원 : " + people + "명");
		
		if(coin == 0) {
			 
		}
	}
}
