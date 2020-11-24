package ex1124;

public class AdvancedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {70, 50, 60, 90, 100};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균: " + avg);

		System.out.println("----------------------------");
		
		int[][] array = {
				{10,20},
				{10,20,30},
				{10,40,50,60}
		};
		
		int sum2 = 0;
		double avg2 = 0.0;
		
		int count = 0;
		for(int i = 0; i > array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum2 += array[i][j];
				count ++;
			}
		}
		avg2 = (double)sum / count;
		
		System.out.println("sum: " + sum2);
		System.out.println("avg: " + avg2);
	}
	
	//왜안나오지 ??

}
