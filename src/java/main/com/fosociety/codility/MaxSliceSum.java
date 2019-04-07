package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
//https://app.codility.com/demo/results/training9VQ4E2-KGW/

class MaxSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int maxEnding = A[0];
        int maxSlice = A[0];
        for(int i = 1; i < A.length; i++) {
            maxEnding = max(A[i], maxEnding + A[i]);
            maxSlice = max(maxSlice, maxEnding);
        }
        return maxSlice;
    }
    
    public int max(int a, int b) {
        return a > b ? a : b;
    }
}
