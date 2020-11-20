package ClassCastException;

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) { //Animal 타입의 animal 매개변수

		Dog dog = (Dog) animal; // ClassCastException 발생가능		
		System.out.println("Dog");
	}
	
}
