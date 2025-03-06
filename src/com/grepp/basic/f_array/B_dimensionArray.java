package com.grepp.basic.f_array;

import java.util.Arrays;

public class B_dimensionArray {

    public static void main(String[] args) {
//        arrayQuiz();
//        pracDarray();
        dynamicArray();
    }

    private static void dynamicArray() {
        // NOTE FB02 : 가변 배열
        // 주소배열의 크기만 저장하고 값을 저장하는 배열의 크기는 미정으로 내버려 두는 것

        int[][] dArr = new int[2][];
        dArr[0] = new int[3];
        dArr[1] = new int[5];

        for (int[] nums : dArr) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = i;
            }

            System.out.println(Arrays.toString(nums));
        }
    }

    private static void arrayQuiz() {
        // 1부터 10까지의 정수를 보관하는 int 배열 3개를 생성하시오

        int[][] dArr = new int[3][10];

        for (int i = 0; i < dArr.length; i++){
            for (int j = 0; j < dArr[i].length; j++){
                dArr[i][j] = j+1;
            }
        }

        for (int[] nums : dArr){
            System.out.println(Arrays.toString(nums));
        }
    }

    // NOTE FB01 : 이차원 배열
    // 이차원 배열 = 배열을 요소로 가지는 배열
    // 이차원 배열의 인덱스로 접근하면 1차원 배열이 존재
    // int[][] arr
    // arr[0] : int[]
    // arr[0][1] : int
    private static void pracDarray() {
        int[] arr = {1, 2, 3, 4, 5};
        // 크기가 4인 int[]을 3개 가지는 2차원 배열
        int[][] dArr = new int[3][4];
        dArr[0][0] = 1;
        dArr[0][1] = 2;
        dArr[0][2] = 3;
        dArr[0][3] = 4;

        for (int i = 0; i < dArr.length; i++){
            int[] nums = dArr[i];

            for (int j = 0; j < nums.length; j++){
                System.out.print(nums[i] + " ");
            }

            System.out.println();
        }
    }

}
