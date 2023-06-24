package linkedlist;

public class App {
    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(1); // 0
        linkedlist.add(2);
        linkedlist.add(3);
        printLinkedList(linkedlist);

        System.out.println("\nremoved: " + linkedlist.remove(0));
        printLinkedList(linkedlist);

        System.out.println("\nadd: 1 in index 0");
        linkedlist.add(1, 0);
        printLinkedList(linkedlist);

        System.out.println("\nadd 4 in last list position");
        linkedlist.add(4, 50);
        printLinkedList(linkedlist);

        System.out.println("\nadd 99 between 1 and 2 in list");
        linkedlist.add(99, 1);
        printLinkedList(linkedlist);

        System.out.println("\nthe size of list");
        System.out.println(linkedlist.size());

        System.out.println("\nremove the 99 element");
        linkedlist.remove(1);
        printLinkedList(linkedlist);

        DoublyLinkedList<String> doublelist = new DoublyLinkedList<>();

        doublelist.add("Lucas");
        doublelist.add("Laura");
        doublelist.add(1, "Nélia");
        doublelist.add(-50, "First");
        doublelist.add(99, "Last");

        printDoubleList(doublelist);
        System.out.println("\nremove the last element");
        doublelist.remove(99);

        System.out.println("\nremove the first element");
        doublelist.remove(0);
        printDoubleList(doublelist);
    }

    private static <T> void printDoubleList(DoublyLinkedList<T> list) {
        System.out.println("\nprint list");
        list.printLinkedList();
    }

    private static <T> void printLinkedList(LinkedList<T> list) {
        System.out.println("\nprint list");
        list.printLinkedList();
    }
}
