package com.fosociety.codility;
//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
class TapeEquilibrium {
    //my solution
    public int solution(int[] A) {
        // write your code in Java SE 8
        int head = A[0];
        int tail = sum(A, 1);
        int diff = Math.abs(head - tail);
        for(int i = 1; i < A.length; i++) {
            head += A[i];
            tail -= A[i];
            if(Math.abs(head - tail) < diff) {
                diff = Math.abs(head - tail);
            }
        }
        return diff;
    }
    public static int sum(int[] A, int index) {
        int sum = 0;
        for(int i = index; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
    
    // 100% correct solution
//    function solution(A) {
//    // write your code in JavaScript (ECMA-262, 5th edition)
//    var p=0;
//    var index=0;
//    var leftSum=0;
//    var rightSum=0;
//    var totalSum=0;
//    var N = A.length;
//
//    var last_minimum=100000;
//
//    if(A.length == 2)
//        return (Math.abs(A[0]-A[1]));
//    if(A.length == 1)
//        return (Math.abs(A[0]));
//
//    for(index=0; index < N; index++)
//        totalSum = totalSum + A[index];
//
//
//    for(p=1; p <= N-1; p++){
//        leftSum += A[p - 1];
//        rightSum = totalSum - leftSum;
//
//        current_min = Math.abs(leftSum - rightSum);
//        last_minimum = current_min < last_minimum ? current_min : last_minimum;
//
//        if (last_minimum === 0)
//            break;
//    }
//    return last_minimum;
//}
}
