package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        // for(초기값; 조건; 증감연산)
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for(int i = 0; i < 2; i++) {
            System.out.println(i);
            for(int z = 0; z < 5; z++) {
                System.out.printf("i값: %d, z값: %d%n", i, z); // %n은 개행
            }
        }
    }
}
