//https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
// Correctness 100%
// Performance 66%
// Task Score 83%

class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[100000];
        int max = 100000;
        for(int i = 0; i < A.length; i++) {
            if (A[i] < 100000) {
                B[A[i] - 1] ++;
            }
        }
        int permutation = 1;
        for (int i = 0; i < A.length; i ++) {
            if(B[i] == 0) {
                permutation = 0;
                break;
            }
        }
        return permutation;
    }
}
