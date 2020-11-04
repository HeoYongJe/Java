
public class IntExample {

	public static void main(String[] args) {

		int var1 = 10; // 10진수로 저장
		int var2 = 012; // 8진수로 저장
		int var3 = 0xA; // 16진수로 저장
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}

// 소수점이 없는 정수리터럴은 10진수로 간주 / 0, 75, 100
// 0으로 시작되는 리터럴은 8진수로 간주 / 02, -04
// 0x or 0X로 시작하고 0~9 숫자나 A,B,C 또는 a,b,c 로 구성된 리터럴은 16진수로 간주 / 0x5, 0xA, 0xAC08 등
