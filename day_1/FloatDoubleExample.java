
public class FloatDoubleExample {

	public static void main(String[] args) {

		double var1 = 3.14123456789101112131415;
//		float var2 = 3.14; 컴파일에러 
		float var3 = 3.1412345678910F;
		
		System.out.println(var1);
//		System.out.println(var2);
		System.out.println(var3);
	}	

}

// 소수점이 있는 리터럴은 10진수 실수로 간주 / 0.25, -3.14
// E 또는 e가 있는 리터럴은 10진수 지수와 가수로 간주 / 5E7 -> 5x10⁷, 0.12E-5 -> 10-₅
// 자바는 실수 리터럴의 기본 타입을 Double로 간주한다
// 실수 리터럴을 float 타입 변수에 그냥 저장 할 수 없고 리터럴 뒤에 f 또는 F를 붙여야 한다



//str = str.replaceAll("0", "₀");
//str = str.replaceAll("-1", "-₁");
//str = str.replaceAll("2", "₂");
//str = str.replaceAll("3", "₃");
//str = str.replaceAll("4", "₄");
//str = str.replaceAll("5", "-₅");
//str = str.replaceAll("6", "₆");
//str = str.replaceAll("7", "₇");
//str = str.replaceAll("8", "₈");
//str = str.replaceAll("9", "₉");
