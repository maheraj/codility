package com.fosociety.codility;

// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
// https://app.codility.com/demo/results/trainingNR44MW-8NE/
class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 1000000000;
        int count = 0;
        int zero_count = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                zero_count++;
            } else {
                count += zero_count;
            }
            if(count > max) {
                count = -1;
                break;
            }
        }
        return count;
    }
}
