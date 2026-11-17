package org.example.e01datatype;

public class E01DataType {
    public void execute() {
        boolean bool = true;
        bool = false;
        // bool = 1; => 선언할 때의 데이터 타입과 다를 경우, 타입에러 발생
        System.out.println(bool);
        System.out.println(bool);
        // System.out.print(bool); 을 두 번 입력하면 falsefalse로 나왔는데 println로 입력하면 개행이 됨
        System.out.printf("현재 변수 bool의 값은 %s", bool);


        // 변수 선언
        int age; // 타입을 지정하고 변수명을 정해줘야 함
        age = 1;
        char ch = 'a'; // ""는 string 타입 char는 딱 문자 한 글자
        String str = "a";


        // 상수 선언 (변경 불가능한 값 : 자바스트립트의 const)
        final String USER_NAME = "길동이";
        // USER_NAME = "sad"; // 할당할 수 없음 오류


        // Underscore 표기법
        int num = 1_020_304_010; // 컴퓨터는 그냥 숫자로 인식하지만 작업자가 보기에 편함, 3자리로 끊는 건 임의로 설정함


        // 두 변수의 값을 스와핑 해보자.
        int swap1 = 1;
        int swap2 = 2;

        int tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;


        // 데이터 타입
        boolean bool2 = true;

        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483648L; // 맨 뒤에 L을 붙여야함

        double db = 3.141592;
        float ft = 3.141592F; // 맨 뒤에 F를 붙여야함

        char ch1 = 'g';
    }
}
