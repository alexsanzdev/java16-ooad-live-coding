package live_coding.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Cesar");
        names.add("Ola");
        names.add("Martina");
        names.add("Luiz");

        //names.sort((o1, o2) -> {
        //    return o1.compareToIgnoreCase(o2);
        //});

        names.sort((o1, o2) -> o2.length() - o1.length());

        names.forEach(System.out::println);

    }
}
