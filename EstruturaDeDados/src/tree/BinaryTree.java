package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T content) {

        BinNode<T> newNode = new BinNode<>(content);
        this.root = insertNode(this.root, newNode);
    }

    public void remove(T content) {

        this.root = removeNode(this.root, content);
    }

    public boolean search(T content) {

        return searchNode(this.root, content);
    }

    public void printOrdered() {

        for (BinNode<T> node : this.getOrderedNodes()) {
            System.out.print("[ " + node.getContent() + " ] ");
        }
        System.out.print("\n");
    }

    public void printTree() {

        System.out.println("\n");
        printTree(root, 0);
    }

    private BinNode<T> insertNode(BinNode<T> current, BinNode<T> newnode) {

        if (current == null) {
            return newnode;
        }

        int comparisonResult = newnode.getContent().compareTo(current.getContent());

        if (comparisonResult < 0) {
            current.setLeftNode(insertNode(current.getLeftNode(), newnode));

        } else {
            current.setRightNode(insertNode(current.getRightNode(), newnode));
        }

        return current;
    }

    private BinNode<T> removeNode(BinNode<T> current, T content) {

        if (current == null) {
            return null;
        }

        int comparisonResult = content.compareTo(current.getContent());

        if (comparisonResult < 0) {
            current.setLeftNode(removeNode(current.getLeftNode(), content));

        } else if (content.compareTo(current.getContent()) > 0) {
            current.setRightNode(removeNode(current.getRightNode(), content));

        } else {

            if (current.getLeftNode() == null && current.getRightNode() == null) {
                return null;
            }

            else if (current.getLeftNode() == null) {
                return current.getRightNode();

            } else if (current.getRightNode() == null) {
                return current.getLeftNode();

            } else {

                BinNode<T> successor = findMinimumNode(current.getRightNode());
                current.setContent(successor.getContent());
                current.setRightNode(removeNode(current.getRightNode(), successor.getContent()));
            }
        }

        return current;
    }

    private boolean searchNode(BinNode<T> current, T content) {

        if (current == null) {
            return false;
        }

        int comparisonResult = content.compareTo(current.getContent());

        if (comparisonResult == 0) {
            return true;

        } else if (comparisonResult < 0) {
            return searchNode(current.getLeftNode(), content);

        } else {
            return searchNode(current.getRightNode(), content);
        }
    }

    private BinNode<T> findMinimumNode(BinNode<T> node) {

        if (node.getLeftNode() == null) {
            return node;
        }

        return findMinimumNode(node.getLeftNode());
    }

    private List<BinNode<T>> getOrderedNodes() {

        List<BinNode<T>> orderedNodes = new ArrayList<>();
        getOrderedNodes(this.root, orderedNodes);
        return orderedNodes;
    }

    private void getOrderedNodes(BinNode<T> current, List<BinNode<T>> orderedNodes) {

        if (current != null) {
            getOrderedNodes(current.getLeftNode(), orderedNodes);
            orderedNodes.add(current);
            getOrderedNodes(current.getRightNode(), orderedNodes);
        }
    }

    private void printTree(BinNode<T> current, int level) {

        if (current == null) {
            return;
        }

        printTree(current.getRightNode(), level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + current.getContent());
        } else {
            System.out.println(current.getContent());
        }

        printTree(current.getLeftNode(), level + 1);
    }

}
