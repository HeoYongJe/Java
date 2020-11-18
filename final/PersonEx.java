
public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-123456", "계백");
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		p1.name = "을지문덕";
		System.out.println(p1.name);
	}

}
