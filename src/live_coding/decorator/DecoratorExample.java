package live_coding.decorator;

import java.util.ArrayList;
import java.util.Collection;

public class DecoratorExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        names.add("Micke");
        names.add("Christian");
        names.add("Siran");

        printSecondName(new IndexBasedCollection(names));
    }

    public static void printSecondName(IndexBasedCollection<String> names) {
        names.get(2);
    }
}
