package linkedlist;

import node.DoubleNode;

public class DoublyLinkedList<T> {

    private int size;
    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    public DoublyLinkedList() {
        this.size = 0;
        this.lastNode = null;
        this.firstNode = null;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(T content) {

        DoubleNode<T> newNode = new DoubleNode<>(content);
        newNode.setPreviousNode(this.lastNode);

        if (this.firstNode == null) {
            this.firstNode = newNode;
        }

        if (this.lastNode != null) {
            this.lastNode.setNextNode(newNode);
        }

        this.lastNode = newNode;
        this.size++;
    }

    public void add(int index, T content) {

        DoubleNode<T> newNode = new DoubleNode<>(content);

        if (size == 0) {

            this.firstNode = newNode;
            this.lastNode = newNode;

        } else if (index <= 0) {

            newNode.setNextNode(this.firstNode);
            this.firstNode.setPreviousNode(newNode);
            this.firstNode = newNode;

        } else if (index >= this.size) {

            newNode.setPreviousNode(this.lastNode);
            this.lastNode.setNextNode(newNode);
            this.lastNode = newNode;

        } else {

            DoubleNode<T> auxNode = this.getNode(index);
            newNode.setNextNode(auxNode);
            newNode.setPreviousNode(auxNode.getPreviousNode());
            auxNode.getPreviousNode().setNextNode(newNode);
            auxNode.setPreviousNode(newNode);
        }

        this.size++;
    }

    public void remove(int index) {

        if (this.isEmpty())
            return;

        if (this.size == 1) {

            this.firstNode = null;
            this.lastNode = null;

        } else if (index <= 0) {
            
            this.firstNode = firstNode.getNextNode();
            this.firstNode.setPreviousNode(null);

        } else if (index >= this.size - 1) {

            this.lastNode = lastNode.getPreviousNode();
            this.lastNode.setNextNode(null);

        } else {

            DoubleNode<T> nodeToRemove = getNode(index);
            DoubleNode<T> previousNode = nodeToRemove.getPreviousNode();
            DoubleNode<T> nextNode = nodeToRemove.getNextNode();

            previousNode.setNextNode(nextNode);
            nextNode.setPreviousNode(previousNode);
        }

        this.size--;
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    private DoubleNode<T> getNode(int index) {

        if (this.isEmpty() || index < 0 || index > this.size()) {
            return null;
        }

        DoubleNode<T> auxNode = this.firstNode;

        for (int i = 0; i < index && auxNode != null; i++) {
            auxNode = auxNode.getNextNode();
        }

        return auxNode;
    }

    public void printLinkedList() {
        DoubleNode<T> current = this.firstNode;
        while (current != null) {
            System.out.println(current);
            current = current.getNextNode();
        }
    }

}
