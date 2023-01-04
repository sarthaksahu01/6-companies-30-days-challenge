// // 150. Evaluate Reverse Polish Notation

// class Solution {
// public int evalRPN(String[] tokens) {
// Stack<Integer> stack = new Stack<Integer>();

// for (int i = 0; i < tokens.length; i++) {
// switch (tokens[i]) {
// case "+":
// stack.push(stack.pop() + stack.pop());
// break;

// case "-":
// stack.push(-stack.pop() + stack.pop());
// break;

// case "*":
// stack.push(stack.pop() * stack.pop());
// break;

// case "/":
// int n1 = stack.pop(), n2 = stack.pop();
// stack.push(n2 / n1);
// break;

// default:
// stack.push(Integer.parseInt(tokens[i]));
// }
// }

// return stack.pop();
// }
// }

// class Solution {
// public int evalRPN(String[] tokens) {
// int[] ls = new int[tokens.length / 2 + 1];
// int index = 0;
// for (String token : tokens) {
// switch (token) {
// case "+":
// ls[index - 2] = ls[index - 2] + ls[index - 1];
// index--;
// break;
// case "-":
// ls[index - 2] = ls[index - 2] - ls[index - 1];
// index--;
// break;
// case "*":
// ls[index - 2] = ls[index - 2] * ls[index - 1];
// index--;
// break;
// case "/":
// ls[index - 2] = ls[index - 2] / ls[index - 1];
// index--;
// break;
// default:
// ls[index++] = Integer.parseInt(token);
// break;
// }
// }
// return ls[0];
// }
// }