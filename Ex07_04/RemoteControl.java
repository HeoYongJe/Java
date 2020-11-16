
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//메소드 선언부만 작성(추상메소드)
	public void turnOff();
	public void turnOn();
	public void setVolume(int volume); 

	//디폴트 메소드 (실행 내용까지 작성)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
