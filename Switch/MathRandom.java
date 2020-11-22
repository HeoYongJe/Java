
public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Math.random()*6);
//		System.out.println((int)Math.random()*6 + 1);
//		System.out.println((double)Math.random()*6);
		
		int num = (int) (Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
		}
	}

}
