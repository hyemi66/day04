package switch_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = null;
//		while(true) {
//			System.out.println("이름입력 : ");
//			name = sc.next();
//			System.out.println("당신 이름 : " + name);
//		}
		
//		int day;
//		while(true) {
//			System.out.print("날짜 입력 : ");
//			day = sc.nextInt();
//			if ( day <= 0) {
//				System.out.println("다시입력");
//			} else if (day % 7 == 1) {
//				System.out.println("월요일");
//			} else if (day % 7 == 2) {
//				System.out.println("화요일");
//			} else if (day % 7 == 3) {
//				System.out.println("수요일");
//			} else if (day % 7 == 4) {
//				System.out.println("목요일");
//			} else if (day % 7 == 5) {
//				System.out.println("금요일");
//			} else if (day % 7 == 6) {
//				System.out.println("토요일");
//			} else if (day % 7 == 0) {
//				System.out.println("일요일");
//			}
//		}
		
		String hs = null;
		String cp = null;
		int num;
		while (true) {
			System.out.println("1.우리집등록\n2.회사등록\n3.등록보기");
			num = sc.nextInt();
			if (num == 1) {
				System.out.print("우리집 : ");
				hs = sc.next();
			} else if (num == 2) {
				System.out.print("회사 : ");
				cp = sc.next();
			} else if (num == 3) {
				System.out.println("우리집 : " + hs);
				System.out.println("회사 : " + cp);
				break;
			} else {
				System.out.println("다시 입력");
			}
		}
		
	}
}
