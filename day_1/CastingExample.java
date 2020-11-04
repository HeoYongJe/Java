
public class CastingExample {

	public static void main(String[] args) {

		short code = 65;
		int codeValue = code; //암시적(implicit)타입변환
		System.out.println(codeValue);
		
		
		int orginalValue = 32768;
		short convValue = (short) orginalValue; // 큰데이터를 작은데이터를 변환할경우 명시적으로 써주어야한다
		System.out.println(convValue);
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		
		//변환으로 인한 데이터 손실이 발생되지 않도록한다
		//checkValueBeforeCasting
		int i = 10;
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) { //(i < -128) || (i > 127) 과 동일
			System.out.println("byte 타입으로 변환x");
			System.out.println("값을 다시 확인해 줴요");
		}
		else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}

//강제타입 변환에서 주의할 점은 사용자로부터 입력받은 값을 변환할 때 값의 손실이 발생하면 안된다는 것이다
//강제타입 변환을 하기 전에 안전하게 값이 보존될 수 있는지 검사하는 것이 좋다