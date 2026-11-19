package org.example.e06oop.inheritance;

public class Whale extends Animal{
    // // 필드 (Field) : 클래스에 선언된 변수
    // public static String name = "고래"; // 인스턴스 변수
    // public static int age = 20; // 클래스 변수
    //
    // // 생성자 메소드
    // // Whale() {};
    //     // *** Whale을 e06oop에서 inheritance로 옮겼더니 MainOOP에서 에러가 뜸.
    //     // Default 라서 그런 건데 이럴 경우 해결 방법은 Public 으로 변경하는 법 밖에 없다
    //
    // // 메소드 (Method) : 일반적인 함수
    // public void swimming() {
    //     System.out.println("고래가 헤엄칩니다.");

    public Whale (String name, String residence) {
        super(name, residence);
    }
        // String.format() : Printf랑 문법은 비슷하지만 콘솔에 결과를 출력하지 않고 문자열로 만들어서 반환하는 메소드

    public String swimming() {
        return String.format("%s이/가 헤엄칩니다.", super.name);
    }
}



