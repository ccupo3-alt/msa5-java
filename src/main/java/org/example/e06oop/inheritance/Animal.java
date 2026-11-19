package org.example.e06oop.inheritance;

public class Animal {
    protected String name;
    protected String residence;

    public Animal(String name, String residence) {
        this.name = name;
        this.residence = residence;
        System.out.println("동물 생성자");
    }

    public String breath() {
        return String.format("%s이/가 숨을 쉽니다.", this.name);
        // String.format() : Printf랑 문법은 비슷하지만 콘솔에 결과를 출력하지 않고 문자열로 만들어서 반환하는 메소드
    }

    public String living() {
        return String.format("%s이/가 %s에서 삽니다.", this.name, this.residence);
    }
}
