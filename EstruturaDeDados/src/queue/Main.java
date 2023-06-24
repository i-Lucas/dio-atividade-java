package queue;

import node.GenericNode;

public class Main {
    public static void main(String[] args) {

        Queue<String> filaString = new Queue<>();

        filaString.enqueue("Lucas");
        filaString.enqueue("Laura");
        filaString.enqueue("Janilton");
        filaString.enqueue("Jaudo");
        filaString.printQueue();

        Queue<Integer> filaInt = new Queue<>();
        filaInt.enqueue(1);
        filaInt.enqueue(2);
        filaInt.enqueue(3);
        filaInt.enqueue(4);
        filaInt.enqueue(5);
        filaInt.printQueue();

         Queue<Integer> fila3 = new Queue<>();
         fila3.enqueue(new GenericNode<Integer>(1));
         fila3.printQueue();
    }
}
