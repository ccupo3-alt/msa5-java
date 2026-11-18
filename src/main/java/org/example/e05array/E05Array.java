package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 길이 3의 인트 배열을 생성 및 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        // 배열의 복사
        // 1) 얕은 복사
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        copyArr[0] = 999; // {999, 5, 9}로 바뀜




        // 2) 깊은 복사
        // (1) System.arraycopy()
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int[originArrSystem.length * 2]; // => length가 6인 인트 빈 배열. 배열은 한 번 길이를 정하면 늘리거나 줄일 수 없음
        System.arraycopy(
                originArrSystem,
                0,
                copyArrSystem,
                0,
                originArrSystem.length
        ); // 인트 배열은 값을 안 넣으면 초기값이 0으로 세팅됨 [0, 0, 0, 0, 0, 0]
        copyArrSystem[0] = 999;


        // (2) Arrays.copyof()
        int[] originArrArrays = {1, 2, 3};
        int[] copyArrArrays = new int[originArrArrays.length * 2]; // 길이 설정이 의미가 없어짐
        // int[] copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length); 이렇게 적는 게 정석
        copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length);
        copyArrArrays[0] = 999;


        // (3) For문으로 직접 구현
        // (3-1)
        int[] originFor = {1, 2, 3};
        int[] copyFor = new int[originFor.length * 2];
        for(int i = 0; i < originFor.length; i++) {
            copyFor[i] = originFor[1];
        };
        // (3-2) => (3-1)과 결과값 동일
        int idx = 0;
        for(int val : originFor) {
            copyFor[idx] = val;
            idx++;
        };



        // 다차원 배열
        int[][] multiArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(multiArr[1][1]);


        // [배열의 API]
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        // 1. 배열의 길이 : (arr.length)
        System.out.println(arr3.length);
        // 2. 배열이 같은지 비교 : (Arrays.equals(arr1, arr2))
        System.out.println(Arrays.equals(arr3, arr4));
        // 2-1. 다차원 배열이 같은지 비교 : (Arrays.deepEquals(arr1, arr2))
        int[][] deepArr1 = {{1, 2, 3}, {4, 5 ,6}};
        int[][] deepArr2 = {{1, 2, 3}, {4, 5 ,7}};
        System.out.println(Arrays.deepEquals(deepArr1, deepArr2));
        // 3. 배열의 정렬 : Arrays.sort(arr)
        int[] sortArr = {43, 6, 7, 8, 4, 34, 2};
        Arrays.sort(sortArr); // 원본이 바뀌어서 사용을 권장하지는 않음
        System.out.println(Arrays.toString(sortArr));
    }
}
