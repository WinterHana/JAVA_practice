package assingment;

public class Operation {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 85;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10)) < 10 && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10)) < 10 || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		char ch = (num1 > i) ? 'T' : 'F';
		System.out.println(ch);
		
		int num = 0B00000101;			// 5를 8비트 2진수로 나타냄
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
