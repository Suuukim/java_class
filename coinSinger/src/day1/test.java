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
		int choice = 0;		//선택
		
		Scanner sc = new Scanner(System.in);
		System.out.print("륨 번호를 입력하세요. > ");
		rnum = sc.nextInt();

		while(rnum > 0) {
			System.out.println("1.코인	  2.시간");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("코인 얼마나 넣어드릴까요? > ");
				coin = sc.nextInt();
			}else if(choice == 2) {
				System.out.print("시간 얼마나 넣어드릴까요? > ");
				time = sc.nextInt();
			}else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
		}
		
		System.out.println("입력한 코인 : " + coin + "개");
		System.out.println("입력한 시간 : " + time + "분");
		System.out.println("입력한 인원 : " + people + "명");
		System.out.println("입력한 서비스 : " + service);
		System.out.println("들어간 시간 : " + starttime);
		System.out.println("룸 번호 : " + rnum);
	}
}
