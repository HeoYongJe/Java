
public class Operator {

	public static void main(String[] args) {
		String s1 = "당신을 사랑합니다";
		String s2 = "당신을 사랑합니다";
		String s3 = new String("당신을 사랑합니다");
		System.out.println(s1==s2);
		System.out.println(s1==s3); // 주소를 비교했으므로 false
		System.out.println(s1.equals(s3)); // 내용을 비교했으므로 true
	
		
	}

}
