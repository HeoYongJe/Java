
public class IfEx {

	public static void main(String[] args) {
		
		int score = 95;
		int rate;
		String msg;
		
		if(score > 90)
			rate = 1;
		else if(score > 80)
			rate = 2;
		else if(score > 70)
			rate = 3;
		else
			rate = 4;
		System.out.println(rate);
		
		switch(rate) {
			case 1:
				msg = "매우 많이 잘했습니다";
				System.out.println(msg);
				break;
			case 2:
				msg = "많이 잘했습니다";
				System.out.println(msg);
				break;
			case 3:
				msg = "잘했습니다";
				System.out.println(msg);
				break;
			case 4:
				msg = "soso";
				System.out.println(msg);
				break;
		}
	}
}