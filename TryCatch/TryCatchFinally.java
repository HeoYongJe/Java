package TryCatch;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz = Class.forName("java.lang.String2");
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}

}
