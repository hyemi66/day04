package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = null;
		System.out.print("문자열 입력 : ");
		msg = sc.next();
		switch(msg) {
		case "안녕" : System.out.println("하세요"); break;
		case "그래" : System.out.println("반갑다");
		}
		System.out.println("다음 문장 실행");
	}
}
