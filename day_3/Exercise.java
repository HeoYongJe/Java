package Ex;

public class Exercise {

	public static void main(String[] args) {

		byte byteValue = 10;
		char charValue = 'A';
		
//		short shortValue = charValue; 타입에러 char 타입의 양의 허용범위가 short 타입보다 더 큼
		double doubleValue = byteValue;
		int intValue = byteValue;
		System.out.println(doubleValue);
		System.out.println(intValue);
		
		//다음 코드에서 컴파일 에러가 발생하는 위치와 이유
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
//		short result = s1 + s2; 연산의 결과가 int 이므로 short 가아닌 int를 써야한다 
		int result2 = i1 + i2;
	}

}
