package stack;

import node.GenericNode;

public class Stack<T> {

    private GenericNode<T> refStartStack; // nó de referencia a topo da pilha
    private int stackLength = 0;

    public Stack() {
        this.refStartStack = null;
    }

    public boolean isEmpty() {
        return refStartStack == null ? true : false;
    }

    public GenericNode<T> top() {
        return this.refStartStack;
    }

    public void push(GenericNode<T> node) {
        GenericNode<T> aux = this.refStartStack;
        this.refStartStack = node;
        this.refStartStack.setRef(aux);
        stackLength++;
    }

    public GenericNode<T> pop() {

        if (this.isEmpty()) {
            return null;

        } else {

            GenericNode<T> popend = this.refStartStack;
            this.refStartStack = this.refStartStack.getNextNode();
            stackLength--;
            return popend;
        }
    }

    public void printStack() {
        GenericNode<T> current = this.refStartStack;
        while (current != null) {
            System.out.println(current);
            current = current.getNextNode();
        }
    }

    public int getStackLength() {
        return this.stackLength;
    }

    public void removeAll() {
        this.stackLength = 0;
        this.refStartStack = null;
    }

}