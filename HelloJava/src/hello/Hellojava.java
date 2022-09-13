package hello;

public class Hellojava {
	public static void main(String[] args) {
		int level, age;
		level = 10;
		age = 25;
		System.out.println(level);
		System.out.println(age);
		
		System.out.println("Hello Java");
		System.out.println("KimDoYeop");
		System.out.println("한글 테스트");
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch5 = '한';
		char ch6 = '\uD55C';
		
		System.out.println(ch5);
		System.out.println(ch6);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66;
		
		System.out.println((char) a);		// A
		System.out.println((char) b);		// ?
		System.out.println(a2);				// A
		
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.01;
		}
		System.out.println(dnum);
		
		final int MAX_NUM = 100;
		System.out.println(MAX_NUM);
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int) dNum1 + (int) fNum2;
		int iNum4 = (int) (dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int x = 10;
		double y = 2.0;
		
		System.out.println((int)(x + y));
		
		// 글 : AE00
		char hangul = '\uAE00';
		System.out.println(hangul);
	}
}
