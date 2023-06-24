package queue;

import node.GenericNode;

public class Queue<T> {

    private GenericNode<T> refNoEntradaFila;
    private Object content;

    public Queue() {
        this.refNoEntradaFila = null;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return this.content;
    }

    public void enqueue(GenericNode<T> node) {
        node.setRef(refNoEntradaFila);
        this.refNoEntradaFila = node;
    }

    public void enqueue(T value) {
        GenericNode<T> newNode = new GenericNode<>(value);
        newNode.setRef(refNoEntradaFila);
        this.refNoEntradaFila = newNode;
    }

    public GenericNode<T> first() {

        if (!this.isEmpty()) {
            GenericNode<T> firstNode = this.refNoEntradaFila;

            while (firstNode.getNextNode() != null) {
                firstNode = firstNode.getNextNode();
            }

            return firstNode;
        }

        return null;
    }

    public GenericNode<T> dequeue() {

        if (!isEmpty()) {

            GenericNode<T> firstNode = refNoEntradaFila;
            GenericNode<T> prevNode = null;

            while (firstNode.getNextNode() != null) {
                prevNode = firstNode;
                firstNode = firstNode.getNextNode();
            }

            if (prevNode != null) {
                prevNode.setRef(null);
            } else {
                refNoEntradaFila = null;
            }

            return firstNode;
        }

        return null;
    }

    public boolean isEmpty() {
        return this.refNoEntradaFila == null ? true : false;
    }

    public void printQueue() {
        GenericNode<T> current = this.refNoEntradaFila;
        System.out.println("\n");
        while (current != null) {
            System.out.println(current);
            current = current.getNextNode();
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return "" + this.content;
    }
}
