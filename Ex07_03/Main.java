
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		dog.sound();
		cat.sound();
		System.out.println("----------");
	
		Animal animal = null; 
		animal = new Dog();//자동타입변환
		animal.sound(); // 재정의된 메소드 호출
		 
		animal = new Cat();//자동타입변환
		animal.sound(); // 재정의된 메소드 호출
	
		System.out.println("----------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		
		animal.sound(); //재정의된메소드 호출
	}

}
