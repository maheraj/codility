// https://app.codility.com/demo/results/demoKZXX8Q-6D9/

import java.util.Arrays;
class MissingInteger2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int max = A[A.length - 1];
        if(max <= 0) {
            return 1;
        }
        
        int[] B = new int[max];
        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                B[A[i] - 1]++;
            }
        }
        
        for(int i = 0; i < max; i++) {
            if(B[i] == 0) {
                return i + 1;
            }
        }
        return max + 1;
        
    }
}
