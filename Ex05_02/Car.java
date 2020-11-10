
public class Car {
	//필드
	private String company; 
	private String model;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	
	public Car() { 
		company = "현대자동차";
		model = "그랜져";
		color = "블랙";
		maxSpeed = 200;
		currentSpeed = 170;
	}
	
	public Car(String cmpy, String mod, String col, int ms, int py) {
		company = cmpy;
		model = mod;
		color = col;
		maxSpeed = ms;
		currentSpeed = 0;
	} // 이걸 왜 꼭 해줘야 하는지 ????
	
	public void setCurrentSpeed(int speed) {
		if(speed <= maxSpeed); //조건을 줌으로써 코드보호
		currentSpeed = speed;
	}//Setter
	
	public int getCurrentSpeed() {
		return currentSpeed; 
	}//Getter

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed <= 300)
		this.maxSpeed = maxSpeed;
	}

	public void keyTurnOn() {
		System.out.println("Key Turn On");
	}
	
	public void run() {
		for(int i = 0; i < maxSpeed; i +=10) {
			currentSpeed = i;
			System.out.println("시속 " + currentSpeed + "Km/h");
		}
	}
}
//embed 방식 1. composition 2.aggregation / 자바는 2번을 지원