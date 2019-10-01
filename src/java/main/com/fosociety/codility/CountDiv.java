package com.fosociety.codility;

import java.util.Scanner;

/**
 *
 * Problem description: https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 * My submission: https://app.codility.com/demo/results/trainingET6FAP-CXG/
 *
 * */
class CountDiv {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextInt(), scan.nextInt(), scan.nextInt()));
    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        return B/K - A/K + (A%K == 0 ? 1 : 0);
    }
}
