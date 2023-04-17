package for_;

public class Ex03 {
	public static void main(String[] args) {
//		for(int i=0; ;i++) {
//			System.out.println(i + "test");
//		}
		
		// 문제
		int k = 20;
		int sumK = 0;
		for (int i=1; i<=60; i++) {
			if (i%10==0) {
				sumK = sumK;
			} else {
				sumK += k;
			}
		}
		System.out.println(sumK);
	}
}
