package org.example.e11enum;

public class MainEnum {
    public static void main(String[] args) {
        // Weeks weeks = new Weeks();
        // System.out.println(Weeks.MONDAY);

        Weeks monday = Weeks.MONDAY;
        System.out.println(monday);
        System.out.println(monday.name());
        System.out.println(monday.getKrDay());
        System.out.println(Weeks.MONDAY.ordinal());
        System.out.println(Weeks.THURSDAY.ordinal()); // 내부 연산 로직에서는 사용하지 않는 걸 권장, 순서성 보장되지 않음
    }
}
