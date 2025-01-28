import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((c == ')' && top == '(') || 
                    (c == '}' && top == '{') || 
                    (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "()";

        System.out.println("Is \"" + s + "\" valid? " + solution.isValid(s1)); 
    }
}
