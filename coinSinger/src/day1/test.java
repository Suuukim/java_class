package day1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// 코인노래방
		
		int coin = 0;	// 코인
		int time = 0;	// 시간
		int service = 0;	//서비스
		int people = 0;	// 인원
		int starttime = 0;	//들어간 시간
		int rnum = 0; 		//룸 넘버
		
		Scanner sc = new Scanner(System.in);
		System.out.print("코인을 입력하세요 > ");
		coin = sc.nextInt();
		
		switch(coin) {
			case 0:
				System.out.print("시간을 입력하세요 > ");
				time = sc.nextInt();
				break;
			default :
				System.out.print("인원을 입력하세요 > ");
				people = sc.nextInt();
				break;
		}
		
		for(int i=0;i<coin;i++) {
			
		}
		System.out.println("입력한 코인 : " + coin + "개");
		System.out.println("입력한 시간 : " + time + "분");
		System.out.println("입력한 인원 : " + people + "명");
		System.out.println("입력한 서비스 : " + service);
		System.out.println("들어간 시간 : " + starttime);
		System.out.println("룸 번호 : " + rnum);
	}
}
