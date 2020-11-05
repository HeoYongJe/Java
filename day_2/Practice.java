
public class Practice {

	public static void main(String[] args) {

		int age;
		age = (int)312312312321313L;
		System.out.println("나이 " + age);
	
		double age2 = age;
		System.out.println(age2);
		
		
		Rainbow color;
		color = Rainbow.red;
		System.out.println(color);
		System.out.println(color.orange);
		System.out.println(color.yellow);
		System.out.println(color.green);
		System.out.println(color.blue);
		System.out.println(color.navy);
		System.out.println(color.purple);
		
		
		String [] lectures = new String[5];
		lectures[0] = "Java";
		lectures[1] = "Web Client";
		lectures[2] = "Spring MVT";
		lectures[3] = "Database";
		lectures[4] = "projects";
		
		for(String lecture : lectures) 
			System.out.println (lecture);
		
		for(int i = 0; i < lectures.length; i++) {
			System.out.println(i + 1 + "번째 강의 :" +lectures[i]);
		}
		
		
	}
		
}
