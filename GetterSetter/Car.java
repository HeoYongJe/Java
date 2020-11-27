
public class Car {
	
	//필드설정
	private int speed;
	private boolean stop;
	
	//기본생성자
	public Car() {};
	
	//생성자
	public Car(int speed, boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}
	
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
