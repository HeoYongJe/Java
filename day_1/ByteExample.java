
public class ByteExample {

	public static void main(String[] args) {

		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 125;
//		byte 경우 -128(최소값)부터 시작해서 127(최대값)을 넘으면 다시 -128부터 시작하게 된다
//		이 처럼 저장할 수 있는 값의 범위를 초과해서 값이 저장될 경우 엉터리 값이 변수에 저장되는데, 이를 쓰레기 값이라 한다
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
//		System.out.println(var6);
	}

}
