package org.example.e06oop.interfaceedu;

public class MainInterface {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        // Fish fish = new Fish(); 는 안 됨 FlyingFish가 Fish의 구현체
        System.out.println(flyingFish.birth());
        // Flight flight = new Flight(); 도 안 됨
        System.out.println(flyingFish.flying());

        Whale whale = new Whale();
        System.out.println(whale.residence());

        // Fish fish = new FlyingFish();
    }
}
