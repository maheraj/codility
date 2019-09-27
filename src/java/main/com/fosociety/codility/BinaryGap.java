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

    //solution using stream java 8
    public int solution(int N) {
        // write your code in Java SE 8
        return Stream.of(
            Integer.toBinaryString(N)
            .replaceAll("0+$", "")
            .split("1+")
            )
            .filter(a -> a != null)
            .map(String::length)
            .max(Integer::compare)
            .orElse(0);
    }
    
    //solution 2 - java 7
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
