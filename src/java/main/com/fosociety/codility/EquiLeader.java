package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/8-leader/equi_leader/
//https://app.codility.com/demo/results/trainingKTYC63-2NC/
import java.util.*;
class EquiLeader {
    int leader = -1000000001;
    int leaderSize = 0;

    public int solution(int[] A) {
        // write your code in Java SE 8

        int leader = findLeader(A);
        if (leader == -1000000001) {
            return 0;
        }
        int result = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                count++;
            }
            int leftArraySize = i + 1;
            if (count > leftArraySize / 2) {
                int rightArraySize = A.length - leftArraySize;
                if (leaderSize - count > rightArraySize / 2) {
                    result++;
                }
            }
        }
        return result;
    }

    int findLeader(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty() || stack.peek().equals(A[i])) {
                stack.push(A[i]);
            } else {
                stack.pop();
            }
        }

        int candidate = leader;
        if (!stack.isEmpty()) {
            candidate = stack.peek();
        } else {
            return candidate;
        }

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;
            }
        }

        if (count > A.length / 2) {
            leader = candidate;
            leaderSize = count;
        }
        return leader;
    }
}
