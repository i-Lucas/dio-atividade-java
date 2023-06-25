package tree;

public class Main {

    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(6);
        tree.insert(9);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(8);
        tree.insert(4);
        tree.insert(7);

        tree.printTree();

        tree.remove(9);
        tree.printTree();

        System.out.println(tree.search(9));

    }
}