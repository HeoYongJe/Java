package 자동타입변환후의멤버접근;

public class Child extends Parent{
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("parent-method3()");
	}
}
