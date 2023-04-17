package if_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 if , else if 또는 else 중 하나만 실행된다.
		 if (조건식) {
		 	종속문장
		 } else if (조건식) {
		 		종속문장
		 } else if (조건식) {
		 		종속문장
		 }
		 ...
		 else {
		 	종속문장
		 }
		*/
		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.print("수입력 : ");
//		num = sc.nextInt();
//		if (num > 100) {
//			System.out.println("100보다 크다");
//		} else if (num > 50) {
//			System.out.println("50보다 크다");
//		} else if (num > 30) {
//			System.out.println("30보다 크다");
//		} else {
//			System.out.println("30과 같거나 작은 수");
//		}
//		System.out.println("다음 문장 실행");
		
		/*
		 커피의 개당 가격은 2000원이다. 10개가 초과하면 초과하는 양에
		 대해서만 개당 1500원씩 받는다.
		 커피의 개수를 입력받아 금액을 출력하시오. 
		*/
		int cf = 2000;
		int num;
		System.out.print("커피개수 : ");
		num = sc.nextInt();
		if (num > 0 && num <= 10) {
			System.out.println("커피가격 : " + cf*num);
		} else if (num > 10) {
			System.out.println("커피가격 : " + (cf*10+(num-10)*1500));
		} else {
			System.out.println("다시 입력해주세요");
		}
	}
}
