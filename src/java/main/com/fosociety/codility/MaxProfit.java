package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
//https://app.codility.com/demo/results/training8MS4T4-9SF/

class MaxProfit {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0) {
            return 0;
        }
        
        int min = A[0];
        int max = A[0];
        int profit = 0;
        
        int low = A[0];
        int high = A [0];
        
        for(int i = 1; i < A.length; i++) {
            if(A[i] > high) {
                high = A[i];
            } else if(A[i] < low) {
                if(profit < high - low) {
                    min = low;
                    max = high;
                    profit = max - min;                    
                }
                low = high = A[i];
            }
        }
        if(profit < high - low) {
            min = low;
            max = high;
            profit = max - min;
        }
        return profit;
    }
}
