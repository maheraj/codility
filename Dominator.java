// https://app.codility.com/programmers/lessons/8-leader/dominator/
// https://app.codility.com/demo/results/trainingAWTJCC-63R/

import java.util.*;

class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        Stack<Integer> stack = new Stack<>();
        int index = -1;
        for(int i = 0; i < A.length; i++) {
            if(stack.isEmpty() || stack.peek().equals(A[i])) {
                stack.push(A[i]);
                index = i;
            } else {
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()) {
            int value = stack.peek();
            int count = 0;
            for(int i = 0; i < A.length; i++) {
                if(A[i] == value) {
                    count++;
                }
            }
            if(count > A.length / 2) {
                return index;
            }   
        }
        return -1;
        
    }
}
