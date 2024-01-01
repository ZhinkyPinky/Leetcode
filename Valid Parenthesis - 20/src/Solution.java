import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                switch (stack.peek()) {
                    case '(' -> {
                        if (s.charAt(i) == ')') {
                            stack.pop();
                        } else {
                            stack.add(s.charAt(i));
                        }
                    }
                    case '{' -> {
                        if (s.charAt(i) == '}') {
                            stack.pop();
                        } else {
                            stack.add(s.charAt(i));
                        }
                    }
                    case '[' -> {
                        if (s.charAt(i) == ']') {
                            stack.pop();
                        } else {
                            stack.add(s.charAt(i));
                        }
                    }
                }
            } else {
                stack.add(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }

}




