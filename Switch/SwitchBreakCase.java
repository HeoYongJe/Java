
public class SwitchBreakCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + "시]");
		
		switch(time) {
		
		case 8 :
			System.out.println("출근합니다");
		case 1 :
			System.out.println("1시간 지각입니다");
		case 10 :
			System.out.println("2시간 지각입니다");
		default :
			System.out.println("점심을 먹습니다");
		}
	}

}

// break가 없는경우 이떄 case값과는 상관없이 실행 된다
// 그예로 위에 case 8 다음에 9가아닌 1이 있지만 실행 되는 것을 볼 수 있다