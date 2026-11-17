class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> stack = new ArrayList<>();
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stack.remove(stack.size() - 1);
                int a = stack.remove(stack.size() - 1);
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