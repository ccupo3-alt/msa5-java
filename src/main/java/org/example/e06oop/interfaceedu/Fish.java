package org.example.e06oop.interfaceedu;

abstract class Fish {
    protected String name;
    protected String residence;

    // 마우스 우클릭하면 제너레이트가 뜸, Constructor 선택 후 필요한 필드 선택
    Fish(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    abstract String residence();

    public String birth() {
        return String.format("%s이/가 알을 낳습니다.", this.name);
    }
}
