import java.util.Scanner;
public class IfEx2 {

	public static void main(String[] args) {
		int sum = 0;
		double average = (double) 0;
		
		int[] aveTemp = { -4, -1, 4, 11, 17, 21, 24, 25, 20, 13, 6, -1 };

		
//		for(int temp : aveTemp);
//		System.out.println();
		
		for(int i = 0; i < aveTemp.length; i++) {
			
			sum += aveTemp[i];			
			average = (double) sum / aveTemp.length;
//			System.out.println(average);
		}
		System.out.println(sum);
		System.out.println(average);
	}

}
//average에 더블을 줬더라도 계산식이 int로 정수기 때문에 계산식에 double , float를 주어야 소수점까지 계산되어 나온다 ㅍ
