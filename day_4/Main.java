
public class Main {

	public static void main(String[] args) {
		
//		#2
		Date currentDate = new Date(); //인스턴스 생성 = 객체 / 초기값이 널(null)이므로 참조변수 선언과 동시에 인스턴스를 생성해준다 = 변수의 초기화
		currentDate.displayDate();
		
//		#4
		Date today = new Date(2020, 11, 9);
		today.displayDate();
	}

}
