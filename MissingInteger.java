// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0) {
            return 1;
        }
        
        int[] B = new int[1000000];
        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                B[A[i] - 1]++;
            }
        }
        
        int smallest = 1000001;
        for(int i = 0; i < B.length; i++) {
            if(B[i] == 0) {
                smallest = i+1;
                break;
            }
        }
        return smallest;
    }
}
