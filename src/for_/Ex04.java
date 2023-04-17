package for_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3조 문제01
//		String even="", odd="";
//		for (int i=1; i<=20; i++) {
//			if (i%2!=0) {
//				odd += i+" ";
//			} else {
//				even += i+" ";
//			}
//		}
//		System.out.println("홀수 : " + odd);
//		System.out.println("짝수 : " + even);
		
		// 3조 문제02
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int sum = 0;
//		for (int i=1; i<=5; i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			sum += num;
//			System.out.println("출력 : " + sum);
//		}
		
		// 3조 문제03
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int sum = 0;
//		System.out.print("수입력 : ");
//		num = sc.nextInt();
//		for (int i=1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 " + num + "까지의 합계 : " + sum);
		
		// 5조 문제01
//		int n;
//		int c = 0;
//		int sum = 0;
//		System.out.print("1부터 100사이의 한개의 숫자 입력 : ");
//		n = sc.nextInt();
//		if (n<1&&n>100) {
//			System.out.println("잘못된 입력입니다");
//		} else {
//			for (int i=1; i<=100; i++) {
//				if (i % n == 0) {
//					c += 1; sum += i;
//				}
//			}
//		}
//		System.out.println(n+"배수의 개수 : " + c);
//		System.out.println(n+"의 배수의 합 : " + sum);
		
		// 5조 문제02
//		int a = 0;
//		int b = 0;
//		for (int i=1; i<=50; i++) {
//			if (i % 2 == 0) {
//				a += i;
//			} else {
//				b += i;
//			}
//		}
//		System.out.println("짝수들의 합 : " + a);
//		System.out.println("홀수들의 합 : " + b);
		
		// 5조 문제03
//		int n;
//		System.out.print("몇단을 출력하실건가요 : ");
//		n = sc.nextInt();
//		for (int i=1; i<=9; i++) {
//			System.out.println(n*i);
//		}
		
		// 5조 문제04 - 다시
//		for () {
//			
//		}
		
		// 4조 문제01
//		int n;
//		int score = 0;
//		System.out.print("총 학생이 몇명인가요? ");
//		n = sc.nextInt();
//		for (int i=1; i<=n; i++) {
//			System.out.print("성적 입력 : ");
//			score = sc.nextInt();
//			score += score;
//		}
//		System.out.println("총 학생수 : " + n);
//		System.out.println("총점 : " + score);
//		System.out.println("평균 : " + score/n);
		
		// 4조 문제02
//		int n;
//		int sum = 0;
//		while (true) {
//			System.out.print("정수 입력 : ");
//			n = sc.nextInt();
//			sum += n;
//			if (n == 0) { System.out.println(sum); break;}
//			
//		}
		
		// 4조 문제03
//		int n;
//		int sum = 0;
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();
//		for (int i=1; i<=n; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 "+n+"까지의 합 : " + sum);
		
		// 2조 문제01
//		int n1, n2;
//		int sum = 0;
//		System.out.print("첫번째 정수 입력 : ");
//		n1 = sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		n2 = sc.nextInt();
//		if (n1 > n2) {
//			for (int i=n2; i<=n1; i++) {
//				sum += i;
//			}
//			System.out.println(n2+"부터 "+n1+"까지의 합 : "+sum);
//		} else {
//			for (int i=n1; i<=n2; i++) {
//				sum += i;
//			}
//			System.out.println(n1+"부터 "+n2+"까지의 합 : "+sum);
//		}
		
		// 2조 문제02
//		int n;
//		System.out.print("몇단을 보실건가요? ");
//		n = sc.nextInt();
//		for (int i=1; i<=9; i++) {
//			System.out.println(i*n);
//		}
		
		// 2조 문제03
//		for (int i=0; i<=20; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i+" ");
//			}
//		}
		
		// 6조 문제01
//		int n;
//		while (true) {
//			System.out.println("어서오세요!");
//			System.out.println("우유 자판기입니다!");
//			System.out.println("주문하시겠습니까?\n1.yes\n2.no");
//			System.out.print("입력=>");
//			n = sc.nextInt();
//			if (n==1) {
//				System.out.println("1.바나나우유 2.딸기우유 3.초코우유 4.원하는 메뉴가 없습니다");
//				System.out.print("번호를 선택해주세요.");
//				System.out.print("메뉴번호입력=>");
//				n = sc.nextInt();
//				switch (n) {
//				case 1 : System.out.println("바나나우유를 선택하셨습니다\n맛있게드세요!"); break;
//				case 2 : System.out.println("딸기우유를 선택하셨습니다\n맛있게드세요!"); break;
//				case 3 : System.out.println("초코우유를 선택하셨습니다\n맛있게드세요!"); break;
//				case 4 : System.out.println("감사합니다. 또 방문해주세요");
//				} break;
//			} else {
//				System.out.println("안녕히가세요!");
//				break;
//			}
//		}
		
		// 6조 문제02
//		int n;
//		int randNum = (int)Math.floor(Math.random()*50);
//		for (int i=1; i<=5; i++) {
//			System.out.print("랜덤 숫자 맞추기 >> ");
//			n = sc.nextInt();
//			if (n != randNum) {
//				System.out.println(i+"번의 기회를 사용하셨습니다.");
//			} else if (n == randNum) {
//				System.out.println("맞추기 성공");
//				break;
//			}
//		}
//		System.out.println("실패");
		
		// 6조 문제03 - 다시
	}
}
