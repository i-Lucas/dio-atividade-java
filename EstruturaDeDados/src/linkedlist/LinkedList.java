package linkedlist;

import node.GenericNode;

public class LinkedList<T> {

    private int size;;
    private GenericNode<T> head;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T content) {

        GenericNode<T> newNode = new GenericNode<T>(content);

        if (this.isEmpty()) {
            this.head = newNode;

        } else {

            GenericNode<T> lastNode = getLastNode();
            lastNode.setNextNode(newNode);
        }

        this.size++;
    }

    public void add(T content, int index) {
        if (index < 0) {
            return;
        }

        GenericNode<T> newNode = new GenericNode<T>(content);

        if (index == 0 || head == null) {
            newNode.setNextNode(head);
            head = newNode;
        } else {
            GenericNode<T> currentNode = head;
            int currentIndex = 0;

            while (currentNode.getNextNode() != null && currentIndex < index - 1) {
                currentNode = currentNode.getNextNode();
                currentIndex++;
            }

            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
        }

        size++;
    }

    public GenericNode<T> remove(int index) {

        if (!isValidIndex(index)) {
            return null;
        }

        if (index == 0) {
            GenericNode<T> removed = head;
            head = head.getNextNode();
            return removed;
        }

        GenericNode<T> previous = this.get(index - 1);
        if (previous == null) {
            return null;
        }

        GenericNode<T> current = previous.getNextNode();
        GenericNode<T> next = current.getNextNode();

        previous.setNextNode(next);
        return current;
    }

    public GenericNode<T> get(int index) {

        if (!this.isValidIndex(index)) {
            return null;
        }

        GenericNode<T> currentNode = this.head;

        for (int i = 0; i < index; i++) {
            if (currentNode == null) {
                return null;
            }
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
    }

    private GenericNode<T> getLastNode() {
        GenericNode<T> currentNode = this.head;

        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return this.size;
    }

    private boolean isValidIndex(int index) {
        return !this.isEmpty() && index >= 0 && index < this.size;
    }

    public void printLinkedList() {
        GenericNode<T> current = this.head;
        while (current != null) {
            System.out.println(current);
            current = current.getNextNode();
        }
    }

}
