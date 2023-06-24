package stack;

import node.GenericNode;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        GenericNode<Integer> n1 = new GenericNode<>(100);
        stack.push(n1);
        stack.printStack();

        Stack<String> stack2 = new Stack<>();
        GenericNode<String> n2 = new GenericNode<>("Lucas");
        stack2.push(n2);
        stack2.printStack();
    }
}
