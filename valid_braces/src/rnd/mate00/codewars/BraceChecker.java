package rnd.mate00.codewars;

import java.util.Stack;

/**
 * https://www.codewars.com/kata/valid-braces/train/java
 */
public class BraceChecker {

    public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        if (braces.isEmpty()) {
            return true;
        } else {
            char[] chars = braces.toCharArray();
            stack.push(chars[0]);
            for (int x = 1; x < chars.length; x++) {
                if (isOpeningBracket(chars[x])) {
                    stack.push(chars[x]);
                } else if (isClosingBracket(chars[x]) && !stack.isEmpty() && !isMatching(stack.pop(), chars[x])) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private boolean isClosingBracket(char bracket) {
        return bracket == ')' || bracket == ']' || bracket == '}';
    }

    private boolean isMatching(char left, char right) {
        return left == '(' && right == ')' ||
                left == '[' && right == ']' ||
                left == '{' && right == '}';
    }

}
