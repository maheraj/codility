package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
//https://app.codility.com/demo/results/training9MKZ2J-FPN/
import java.util.*;
class Fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> result = new Stack<>();
        Stack<Integer> resultStream = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (result.isEmpty()) {
                result.push(A[i]);
                resultStream.push(B[i]);
            } else {
                while (!result.isEmpty()) {
                    if (resultStream.peek() == 1 && B[i] == 0) {
                        if (result.peek() < A[i]) {
                            result.pop();
                            resultStream.pop();
                        } else {
                            break;
                        }
                    } else {
                        result.push(A[i]);
                        resultStream.push(B[i]);
                        break;
                    }

                    if (result.isEmpty()) {
                        result.push(A[i]);
                        resultStream.push(B[i]);
                        break;
                    }
                }
            }
        }
        return result.size();
    }
}
