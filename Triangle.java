// https://app.codility.com/programmers/lessons/6-sorting/triangle/
// https://app.codility.com/demo/results/trainingQ4XREV-JB9/

import java.util.Arrays;
class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 0; i < A.length -2; i++) {
            if((A[i+2] - A[i+1] - A[i]) < 0) {
                return 1;
            }
        }
        return 0;
    }
}
