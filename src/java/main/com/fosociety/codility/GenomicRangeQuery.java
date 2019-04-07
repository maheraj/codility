package com.fosociety.codility;

// https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
// https://app.codility.com/demo/results/trainingZCW8BK-DJR/
// Correctness 100%, Performance 0%
class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] A = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            A[i] = (S.charAt(i) == 'A' ? 1 : (S.charAt(i) == 'C' ? 2 : S.charAt(i) == 'G' ? 3 : 4));
        }

        int m = P.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int x = P[i];
            int y = Q[i];
            int min = A[x];

            for (int j = x; j <= y; j++) {
                if (min > A[j]) {
                    min = A[j];
                }
            }
            result[i] = min;
        }
        return result;
    }

    // https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
    // https://app.codility.com/demo/results/trainingUH668G-XZ8/
    // 100%
    public int[] solution2(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[][] G = new int[4][S.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            short a = 0;
            short c = 0;
            short g = 0;
            short t = 0;

            if (S.charAt(i) == 'A') {
                a = 1;
            } else if (S.charAt(i) == 'C') {
                c = 1;
            } else if (S.charAt(i) == 'G') {
                g = 1;
            } else if (S.charAt(i) == 'T') {
                t = 1;
            }
            G[0][i + 1] = G[0][i] + a;
            G[1][i + 1] = G[1][i] + c;
            G[2][i + 1] = G[2][i] + g;
            G[3][i + 1] = G[3][i] + t;
        }

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int from = P[i];
            int to = Q[i] + 1;
            if (G[0][to] - G[0][from] > 0) {
                result[i] = 1;
            } else if (G[1][to] - G[1][from] > 0) {
                result[i] = 2;
            } else if (G[2][to] - G[2][from] > 0) {
                result[i] = 3;
            } else if (G[3][to] - G[3][from] > 0) {
                result[i] = 4;
            }
        }
        return result;
    }

}