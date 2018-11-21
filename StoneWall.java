//https://app.codility.com/demo/results/trainingKHG7UP-S2X/
//https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
import java.util.*;
class StoneWall {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int count = 0;
        if (H == null || H.length == 0) {
            count = 0;
        } else if (H.length == 1) {
            count = 1;
        } else {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < H.length; i++) {

                if (stack.isEmpty()) {
                    stack.push(H[i]);
                    count++;
                } else if (H[i] == stack.peek()) {
                    //do nothing
                } else if (H[i] > stack.peek()) {
                    stack.push(H[i]);
                    count++;
                } else {
                    while (!stack.isEmpty()) {
                        if (stack.peek() > H[i]) {
                            stack.pop();
                        } else if (stack.peek() < H[i]) {
                            stack.push(H[i]);
                            count++;
                            break;
                        } else {
                            break;
                        }
                    }
                    if (stack.isEmpty()) {
                        stack.push(H[i]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
