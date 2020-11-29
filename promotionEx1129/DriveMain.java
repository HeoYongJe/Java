package 타입변환과다형성;

public class DriveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
//이와 같이 매개값의 자동 타입 변환과 메소드 재정의를 이용해서 매개 변수의 다형성을 구현할 수 있다