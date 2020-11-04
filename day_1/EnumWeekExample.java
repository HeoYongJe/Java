import java.util.Calendar;
public class EnumWeekExample {

	public static void main(String[] args) {
		
		week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.sunday;
				break;
			case 2:
				today = Week.monday;
				break;
			case 3:
				today = Week.tyesday;
				break;
			case 4:
				today = Week.wedenesday;
				break;
			case 5:
				today = Week.thursday;
				break;
			case 6:
				today = Week.friday;
				break;
			case 7:
				today = Week.Saturday;
				break;
		}
		System.out.println("요일 : " + week);
	}

}
