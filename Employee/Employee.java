
public class Employee {
	private String name;
	private String phoneNumber;
	private String email;

	//기본생성자
	Employee(){};
	
	//생성자
	public Employee(String name, String phoneNumber, String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	//메서드
	public void displayEmployee() {
		System.out.printf("이름: %s, 전화번호: %s, 이메일: %s\n", name, phoneNumber, email);
	}
}

