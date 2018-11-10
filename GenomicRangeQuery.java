// https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
// https://app.codility.com/demo/results/trainingZCW8BK-DJR/
// Correctness 100%, Performance 0%


class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] A = new int[S.length()];
        for(int i = 0; i < S.length(); i++) {
            A[i] = (S.charAt(i) == 'A' ? 1 : (S.charAt(i) == 'C' ? 2 : S.charAt(i) == 'G' ? 3 : 4));
        }
        
        int m = P.length;
        int[] result = new int[m];
        
        for(int i = 0; i < m; i++) {
            int x = P[i];
            int y = Q[i];
            int min = A[x];
            
            for(int j = x; j <= y; j++) {
                if(min > A[j]) {
                    min = A[j];
                }
            }
            result[i] = min;
        }
        return result;
    }
}
