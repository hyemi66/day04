package if_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 정수를 입력받아 아래와 같이 출력
		 3의 배수이며 4의 배수
		 3의 배수
		 4의 배수
		 3,4의 배수아님
		 0은 잘못입력 
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("다시 입력");
		} else if (num % 3 == 0 && num % 4 == 0) {
			System.out.println("3의 배수이며 4의 배수");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else if (num % 4 == 0) {
			System.out.println("4의 배수");
		} else {
			System.out.println("3,4의 배수 아님");
		}
	}
}
