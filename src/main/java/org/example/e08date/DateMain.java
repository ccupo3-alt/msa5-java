package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026,11,20,14,38,40);

        // ISO 표준 시계열 문자열 -> 날짜 객체
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-01T11:30:12");

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체(포매터 이용)
        // ↓ parsedDate2 식
        String date = "2026-11-01 11:30:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(date, dateTimeFormatter);

        System.out.println(now);
        System.out.println(parsedDate1);
        System.out.println(parsedDate2);

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);

        System.out.println("=========================");
        // 날짜 계산
        LocalDateTime addOneDayFromNow = now.plusDays(1L);
        System.out.println(now);
        System.out.println(addOneDayFromNow);

        System.out.println("=========================");
        // 상대적인 날짜 계산 (TemporalAdjusters)
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfMonth);
        System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        System.out.println("=========================");
        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025,9,10);
        System.out.println(d1.isBefore(d2)); // d1이 d2보다 과거인지 => false
        System.out.println(d1.isAfter(d2)); // d1이 d2보다 미래인지 => true
        System.out.println(d1.isEqual(d2)); // d1이 d2와 같은 날인지 => false

        System.out.println("=========================");
        // Period 객체 : 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears())); // 음수로 나오는 값을 양수로 전환
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));
        System.out.println(p1);

        System.out.println("=========================");
        // ChronoUnit 객체
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));

        System.out.println("=========================");
        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);
    }
}
