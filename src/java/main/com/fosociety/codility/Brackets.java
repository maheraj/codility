package com.fosociety.codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * Problem description: https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 * My submission: https://app.codility.com/demo/results/trainingENE2DP-QNT/
 *
 */
class Brackets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextLine()));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        if (S.length() == 0) {
            return 1;
        }
        if (S.length() % 2 == 1) {
            return 0;
        }

        Map<Character, Character> openingBrackets = new HashMap<>();
        openingBrackets.put('{', '{');
        openingBrackets.put('[', '[');
        openingBrackets.put('(', '(');


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(S.charAt(i));
            } else {
                if (openingBrackets.get(S.charAt(i)) != null) {
                    stack.push(S.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return 0;
                    }

                    Character peek = stack.pop();
                    switch (S.charAt(i)) {
                        case '}':
                            if (!peek.equals(openingBrackets.get('{'))) {
                                return 0;
                            }
                            break;
                        case ']':
                            if (!peek.equals(openingBrackets.get('['))) {
                                return 0;
                            }
                            break;
                        case ')':
                            if (!peek.equals(openingBrackets.get('('))) {
                                return 0;
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
