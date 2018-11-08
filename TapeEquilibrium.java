//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
class TapeEquilibrium {
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
}
