package day1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// 코인노래방
		
		input c = new input();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("륨 번호를 입력하세요. > ");
		c.rnum = sc.nextInt();

		while(c.rnum < 25) {
			System.out.println("코인제와 시간제 선택해주세요.");
			System.out.print("1.코인	  2.시간  >>>> ");
			c.choice = sc.nextInt();
			if(c.choice == 1) {
				System.out.print("코인제 얼마나 넣어드릴까요? > ");
				c.coin = sc.nextInt();
				System.out.println(c.rnum + "번방 : 코인" + c.coin + "개");
				break;
			}else if(c.choice == 2) {
				System.out.print("시간제 얼마나 넣어드릴까요? > ");
				c.time = sc.nextInt();
				System.out.println(c.rnum + "번방 : 시간 " + c.time + "분");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
	}
}
