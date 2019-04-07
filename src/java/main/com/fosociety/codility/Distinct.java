package com.fosociety.codility;

// https://app.codility.com/programmers/lessons/6-sorting/distinct/
// https://app.codility.com/demo/results/trainingAP66W2-MYS/

import java.util.Arrays;
class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int count = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i] != A[i-1]) {
                count++;
            }
        }
        return count;
    }
}
