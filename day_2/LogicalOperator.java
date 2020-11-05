
public class LogicalOperator {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {//비트연산자 
			System.out.println("대문자이군요");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자이군요");
		}
		
		if((charCode >= 48) && (charCode <= 57)) {
			System.out.println("0~9숫자이군요");
		}
		
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) { //비트연산자 
			System.out.println("2또는3의 배수이군요");
		}
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2또는3의 배수이군요");
		}
		
		
		int i1 = 20;
		int i2 = 6;
		int i3 = i1 % i2;
		System.out.println(i3);
		
		short s1 = 10;
		short s2 = 100;
//		short s3 = s1 + s2; // 크기가 안되므로 오류가 난다
		int s3 = s1 + s2;
		System.out.println(s3);
		
		int c1 = 10;
		int c2 = 10;
		int d1 = 2 * ++c1;
		int d2 = 2 * c2++;
		System.out.println(d1);
		System.out.println(d2);
		
		int q = 10, w = 20;
		int e = 100, r = 200;
		boolean result = (++q > ++w) && (++e < ++r);
		System.out.println(!result);
		
	}

}
