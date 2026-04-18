package parametrized_classes.practice_2;

import java.util.ArrayList;
import java.util.List;

// Зачем нужны extends и super:
// <? extends T>: Producer Extends - используется, когда нужно читать элементы типа T из коллекции (коллекция производит элементы). Нельзя писать.
// <? super T>: Consumer Super - используется, когда нужно записывать элементы типа T в коллекцию (коллекция потребляет элементы). Можно читать только как Object.
// Это называется принципом PECS
class Wildcards {
    static void read(List<? extends Number> src) { // можно читать как Number
        for (Number n : src) System.out.println(n);
        // src.add - нельзя писать
    }
    static void write(List<? super Integer> dst) { // можно писать Integer
        dst.add(10);
        dst.add(20);
        // Integer x = dst.get(0) - нельзя читать как Integer (только Object)
    }

    public static void main(String[] args) {
        read(List.of(1, 2, 3));          // List<Integer>
        write(new ArrayList<Number>());  // List<Number> подходит
    }
}
