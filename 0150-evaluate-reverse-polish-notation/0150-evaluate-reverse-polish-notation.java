class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (t) {
                    case "+": stack.add(a + b); break;
                    case "-": stack.add(a - b); break;
                    case "*": stack.add(a * b); break;
                    case "/": stack.add(a / b); break;
                }
            } else {
                stack.add(Integer.parseInt(t));
            }
        }
        return stack.get(0);
    }
}   

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna