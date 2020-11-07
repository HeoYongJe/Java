package day_3;

public class promotionExample {
    public static void main(String [] args) {
        //정수타입이 실수타입으로 저장될 경우에는 무조건 자동 타입 변환이 일어난다 / 정수타입보다 실수타입의 허용 범위가 더 크기 때문
        long longValue = 5000000000L;
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        char charValue = 'A'; // 소문자 a 와 대문자 A가 다른이유는 ????
        int intValue = charValue;
        System.out.println(intValue); // char타입의 경우 int 타입으로 자동 변환되며 유니코드 값이 int에 저장된다  a = 65 / A = 97 

        // 자동타입변환 예외

        byte byteValue = 65;
        char charValue2 = byteValue; // 컴파일에러 / byte는 char타입보다 허용범위가 작지만, char타입은 음수를 포함하지 않는데 byte타입은 음수롤 포함하기 때문에 컴파일 에러가 뜬다
        
    }
}
