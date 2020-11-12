//자식 클래스
public class DmbCellPhone extends Cellphone{ // extends 부모 / 를 해줌으로서 부모의 내용을 상속받는다
	
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 "+ channel + " 번 Dmb 방송 수신을 시작합니다");
	}
}
