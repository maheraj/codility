// https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
// https://app.codility.com/demo/results/training3RMZ7B-48P/
import java.util.Arrays;
class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int n = A.length;
        int negCount = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] < 0) {
                negCount++;
            }
        }
        int posCount = n - negCount;
        
        if(posCount == 0 || negCount < 2) {
            return (A[n-1] * A[n-2] * A[n-3]);
        }
        
        int[] nA = new int[negCount];
        int[] pA = new int[posCount];
        
        for(int i = 0; i< A.length; i++) {
            if(i < negCount) {
                nA[i] = A[i];
            } else {
                pA[i-negCount] = A[i];
            }
        }
        
        int p1 = nA[0] * nA[1];
        if(posCount < 3) {
            return p1 * pA[posCount - 1];
        } else {
            int p2 = p1 * pA[posCount - 1];
            int p3 = pA[posCount - 1] * pA[posCount - 2] * pA[posCount - 3];
            return p2 > p3 ? p2 : p3;
        }
    }
}
