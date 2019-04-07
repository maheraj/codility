package com.fosociety.codility;

import java.util.*;
// https://app.codility.com/demo/results/trainingXCN32J-87X/
// https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
class Nesting {
    public int solution(String S) {
        // write your code in Java SE 8
        if (S.length() == 0) {
            return 1;
        }
        if (S.length() % 2 == 1) {
            return 0;
        }


        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(S.charAt(i));
            } else {
                if (S.charAt(i) == '(') {
                    stack.push(S.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return 0;
                    }
                    
                    Character peek = stack.pop();
                    if (!peek.equals('(')) {
                        return 0;
                    }
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
