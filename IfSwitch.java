package ex1123;

import java.util.Scanner;

public class IfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		value = scanner.nextInt();
		
		for(int i = 0 ; i > value; ++i) {

			if(value >= 90) {
				System.out.println("1등급 입니다.");
			}
			else if(value >= 80 && value < 90) {
				System.out.println("2등급 입니다.");
			}
			else if(value >= 70 && value < 80) {
				System.out.println("3등급 입니다.");
			}
			else {
				System.out.println("분발하세요.");
			}
		}
		
//		switch(value) {
//		case 1 :
//			System.out.println("아주 많이 훌륭 합니다");
//			break;
//		}
//		case 2 :
//			System.out.println("아주 훌륭 합니다");
//			break;
//		}
//		case 3 :
//			System.out.println("훌륭 합니다");
//			break;
//		}
//		case 4 :
//			System.out.println("노력하세요");
//			break;
//		}
		
	}

}
