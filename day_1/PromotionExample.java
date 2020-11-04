
public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue; //byte -> int
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue); //char -> int
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue); //int -> long
		
		intValue = 200;
		double doubleValue = intValue; //int -> double
		System.out.println(doubleValue);
		
	}

}
