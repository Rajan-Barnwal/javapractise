public static boolean isBalanced(String expression) {
    Stack stack = new Stack(expression.length());

    for (char c : expression.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else if (c == ')' || c == ']' || c == '}') {
            if (stack.isEmpty()) {
                return false; // Unmatched closing parenthesis
            }

            char topChar = (char) stack.pop();
            if ((c == ')' && topChar != '(') ||
                (c == ']' && topChar != '[') ||
                (c == '}' && topChar != '{')) {
                return false; // Mismatched closing parenthesis
            }
        }
    }

    return stack.isEmpty(); 