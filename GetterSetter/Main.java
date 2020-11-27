
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50); // 음수일경우 0이 나오도록 설정했다
		System.out.println("현재 속도 : " + myCar.getSpeed()); //0
		
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed()); //정상적으로 입력한 60이 나온다
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		} // Getter(isStop()) 리턴값이 false일 경우 자동차를 멈추기 위해 Setter(setStop())를 호출해서 stop 필드를 true로 speed필드를 0으로 변경한다 
		
		System.out.println("현재 속도 : " + myCar.getSpeed()); //0
	}

}
