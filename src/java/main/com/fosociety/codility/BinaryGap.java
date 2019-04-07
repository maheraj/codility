package com.fosociety.codility;

import java.util.Scanner;

/**
 * Problem description: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 * */
class BinaryGap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextInt()));
    }

    public static int solution(int n) {
        String result = Integer.toBinaryString(n);
        int max = 0;
        int count = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1') {
                if (max < count) {
                    max = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return max;
    }
}
