package org.example.e06oop;

public class ConstructOOP {
    private String name; // 얘네는 필드
    private int age;
    private final char gender;

    // 생성자 (constructor) : 클래스를 인스턴스화 할 때 최초 1회만 실행되는 메소드
    //                       주로 객체의 초기화 또는 인스턴스 생성 시 실행되어야 할 작업을 위해 사용

    // 1. 기본 생성자 : 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자
    public ConstructOOP() {
        this("무명", 20, 'M');
        // *** "M"으로 입력했더니 에러가 뜸 char 타입이라 ''로 입력해야함 String 타입을 ""로 입력
    } // 메소드의 형태와 유사한데 리턴 타입이 없음

    // 2. 커스텀 생성자 :
    public ConstructOOP(String name) {
        // this : 참조변수, 나 자신(클래스) 안에 있는 변수(필드)를 선택
        // this.name = name;
        this(name, 20);
    } // 생성자 메소드도 오버로딩이 됨... 무슨 말이지...
    public ConstructOOP(String name, int age) {
        // this.name = name; 이렇게 적어도 동작은 하는데 실무에서 사용하지 않음. 위에 만들어둔 name 생성자를 가져오자
        // this(name); // 다른 생성자를 호출할 땐 항상 맨 위에 적기 !!! 순서 그냥 외우자
        // this.age = age;
        this(name, age, 'M');
    }
    public ConstructOOP(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
