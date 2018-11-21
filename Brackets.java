//https://app.codility.com/demo/results/trainingENE2DP-QNT/
// https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/

import java.util.*;
class Brackets {
    public int solution(String S) {
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
        Character[] characters = new Character[S.length()];
        for (int i = 0 ; i < S.length(); i++) {
            characters[i] = S.charAt(i);
        }


        for (int i = 0; i < characters.length; i++) {
            if (stack.isEmpty()) {
                stack.push(characters[i]);
            } else {
                if (openingBrackets.get(characters[i]) != null) {
                    stack.push(characters[i]);
                } else {
                    if (stack.isEmpty()) {
                        return 0;
                    }
                    
                    Character peek = stack.pop();
                    switch (characters[i]) {
                        case '}' :
                            if (!peek.equals(openingBrackets.get('{'))) {
                                return 0;
                            }
                            break;
                        case ']' :
                            if (!peek.equals(openingBrackets.get('['))) {
                                return 0;
                            }
                            break;
                        case ')' :
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
