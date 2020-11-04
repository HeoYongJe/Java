
public class LongExample {

	public static void main(String[] args) {

		long var1 = 10;
		long var2 = 20L;
		
//		long var3 = 100000000000; 컴파일 에러 / 타입의 저장 범위를 넘어서는 정수 리터럴에 L을 붙히지 않았기 때문
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}

}
