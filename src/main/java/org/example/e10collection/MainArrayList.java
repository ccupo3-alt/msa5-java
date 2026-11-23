package org.example.e10collection;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(10);
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // 특정 인덱스의 값을 가져오고 싶다
        System.out.println(list1.get(0));
        System.out.println(list1.size());

        list1.forEach((i) -> {
            System.out.println(i);
        });
    }
}
