
public class Sign0peratorEx {

	public static void main(String[] args) {
		int x = -100;
		int result = +x;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		
		short s = 100;
//		short result =-s;// 컴 파일러에러
		int result3 = -s;
		System.out.println("result13" + result3);

		char c1 = 'A' + 1;
		char c2 = 'A';
		System.out.println("c1 " + c1);
		System.out.println("c2 " + c2);
	
	
		String str1 = "jdk " + 3 + 3.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK " + 3 + 30;
		String str4 = 3 + 3.0 + " JDK";
		System.out.println(str3);
		System.out.println(str4);
	}

}
