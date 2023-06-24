package node;

public class GenericNode<T> {

    private T genericContent;
    private GenericNode<T> nextNode;

    public GenericNode(T content) {
        this.genericContent = content;
        this.nextNode = null;
    }

    public T getContent() {
        return genericContent;
    }

    public void setContent(T content) {
        this.genericContent = content;
    }

    public GenericNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(GenericNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + this.genericContent;
    }

    public void setRef(GenericNode<T> reference) {
        this.nextNode = reference;
    }
}
