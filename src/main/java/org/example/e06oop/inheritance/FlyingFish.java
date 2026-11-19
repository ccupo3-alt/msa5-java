package org.example.e06oop.inheritance;

public class FlyingFish extends Animal{ // 부모 걸 상속 받을 때
    public FlyingFish(String name, String residence) {
        super(name, residence); // super : 자식이 부모한테 접근할 때(생성자 메소드 호출)
        System.out.println("날치 생성자");
    }


    public String flying() {
        return String.format("%s이/가 날아갑니다.", super.name);
    }

    // 오버라이딩(Overriding) : 부모에게서 상속 받은 메소드를 자식이 재정의하여 사용
    @Override //어노테이션? 없어도 동작은 하지만 작업자끼리의 가독성을 위해 반드시 적는 걸 권장
    public String living() {
        return "수정했다";
    }
}
