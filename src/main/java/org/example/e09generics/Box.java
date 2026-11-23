package org.example.e09generics;

public class Box<T> { // 보통 대문자 1글자 사용. T는 type의 약자
    public T arr;

    public Box(T arr) {
        this.arr = arr;
    }

    public void test() {

    }
}
