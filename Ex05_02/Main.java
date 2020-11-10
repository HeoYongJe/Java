
public class Main {


	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println("제작회사 " + car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed() + " km/h"); 
		System.out.println(car.getCurrentSpeed());
		
		Car car2 = new Car("기아자동차","소나타","화이트",300,0);
		System.out.println("제작회사 " + car2.getCompany());
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getMaxSpeed() + " km/h"); 
		System.out.println(car2.getCurrentSpeed());
		
		Car car3 = new Car("쉐보레","말리부","쥐색",300,0);
		car3.keyTurnOn();
		car3.run();
		int speed = car.getCurrentSpeed();
		System.out.println(speed);
	}

}
