package TryCatch;

import java.util.Arrays;

public class IntegerParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int r = Integer.parseInt("10", 16);
			System.out.println(r);
		}catch(NumberFormatException e) {
			System.out.println("변환할 수 없음");
		}
	}

}
