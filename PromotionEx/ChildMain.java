package PromotionEx;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
//		Parent parent = new Parent();
		
		Parent parent = child; //자동타입변환
		parent.method1();
		parent.method2();
		
		//Parent-method1()
		//Child-method2()
		//위에 자동타입변환으로 인해 method2는 재정의된 메소드가 호출된다
	}

}
