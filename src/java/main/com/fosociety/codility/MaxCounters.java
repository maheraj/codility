package com.fosociety.codility;

// https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/

class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] B = new int[N];
        int max = 0;
        int base = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] <= N) {
                if(B[A[i] -1] <= base) {
                  B[A[i] -1] = base + 1;
                } else {
                  B[A[i] -1]++;
                }
                
                if(max < B[A[i] -1]) {
                    max = B[A[i] -1];
                }
            } else {
              base = max;
            }
        }
        for(int i = 0; i < B.length; i++) {
          if(B[i] < base) {
            B[i] = base;
          }
        }
        return B;
    }
}
