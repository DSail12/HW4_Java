// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


package hw4_java;

import java.util.Arrays;

public class task2 {

    public static void main(String[] args) {

        NewClass newClass = new NewClass();

        System.out.print("Empty Array: ");
        System.out.println(Arrays.toString(newClass.get()));
        System.out.println("Size: " + newClass.size);

        System.out.println();
        System.out.println("Queued: 1-10 ");
        for (int i = 1; i < 11; i++) {
            newClass.enqueue(i);
        }
        System.out.println(Arrays.toString(newClass.get()));
        System.out.println("Size: " + newClass.size);
        System.out.println("In memory: " + Arrays.toString(newClass.arr));

        System.out.println();
        System.out.print("First: ");
        System.out.println(newClass.first());
        System.out.println(Arrays.toString(newClass.get()));
        System.out.println("Size: " + newClass.size);

        System.out.println();
        System.out.print("Dequeued: ");
        System.out.println(newClass.dequeue());
        System.out.println(Arrays.toString(newClass.get()));
        System.out.println("Size: " + newClass.size);
    }
    
}
