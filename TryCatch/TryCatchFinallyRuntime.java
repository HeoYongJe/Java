package TryCatch;

public class TryCatchFinallyRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "";
		String data2 = "";
		
		try {
			data1 = args[0];
			data1 = args[1];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
			System.out.println("[실행 방법");
			System.out.println("java TryCatchFinallyRuntime num1 num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1); //Integer로 변환해주는
			int value2 = Integer.parseInt(data1);//parseInt()는 문자열 String타입의 숫자를 int타입으로 변환

			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + "= " + result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다");
		}
		finally {
			System.out.println("다시 실행하세요");
		}
	}

}
