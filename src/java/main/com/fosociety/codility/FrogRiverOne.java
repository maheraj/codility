package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/

class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] B = new int[X];
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] <= X && B[A[i] - 1] == 0) {
                B[A[i] - 1]++;
                sum++;
            }
            if(sum == X) {
                return i;
            }
        }
        return -1;
    }
}
