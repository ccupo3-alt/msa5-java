package org.example.e11enum;

public enum Weeks {
    // Enum : 상수의 집합을 편리하게 선언하고 사용하기 위해 만든 객체
    // 상수 만들어야 하면 반드시 이넘객체를 만들어라 !!!!!
    MONDAY("월요일", 1), // = private Weeks MONDAY = new Weeks();
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 0);

    private final String krDay;
    private final int dayNum;

    Weeks(String krDay, int dayNum) {
        this.krDay = krDay;
        this.dayNum = dayNum;
    }

    // getter (우클릭, 제너레이트로 쉽게 생성 가능)
    public String getKrDay() {
        return this.krDay;
    }

    public int getDayNum() {
        return dayNum;
    }
}
// public class Weeks {
    // public final static String MONDAY = "월요일"; // class에서는 이렇게 만듦
    // public final static String TUESDAY = "화요일";
    //
    // public static String convertKrToEn(String day) {
    //     switch (day) {
    //         case Weeks.MONDAY:
    //             return "MONDAY";
    //         case Weeks.TUESDAY:
    //             return "TUESDAY";
    //         default:
    //             return "";
    //     }
    // }


    // private Weeks MONDAY = new Weeks("월요일");
    // private Weeks TUESDAY = new Weeks("화요일");
    //
    // private  final String day;
    // public Weeks() {} // 기본 생성자
    // public Weeks(String day) {
    //     this.day = day;
    // }
    //
    // public String getDay() {
    //     return this.day;
    // }
// }