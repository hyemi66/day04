package for_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 for (초기값; 조건식; 증감식) {
		 	종속문장
		 }
		 반복문을 사용할 경우
		 - 어떠한 식이 동일하게 동작해야 하는 경우
		 - 어떠한 값이 규칙적으로 변하는 경우 
		*/
//		int i = 1, sum = 0;
//		for(i=1; i<=10; i++) {
//			sum = sum + i;
//		}
//		System.out.println("합 : " + sum);
//		System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("반복 횟수 입력 : ");
		num = sc.nextInt();
		for (int k=0; k<num; k++) {
			System.out.println("k : " + k);
		}
		
	}
}
