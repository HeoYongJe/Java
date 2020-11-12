//부모 클래스
public class Cellphone {
	//필드
	String model;
	String color;
	
	//생성자
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드
	void powerOn() { System.out.println("전원을 켭니다"); }
	void powerOff() { System.out.println("전원을 끕니다"); }
	void bell() { System.out.println("벨이 울립니다"); }
	
	public void DisplayCellphone() {
		System.out.printf("모델 : %s, 색상 : %s\n", model,color);
	}
}
