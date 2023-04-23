// for tasks 1 and 2

package HW11.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMergeTest {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Olga", "Svitlana", "Olaf", "Michael", "Yegor", "Polina");
        Stream<String> indexes = Stream.of("1", "2", "3", "4", "5");

        merge(names, indexes).peek(System.out::println).collect(Collectors.toList());
    }

    public static Stream<String> merge(Stream<String> aStream, Stream<String> bStream) {
        List<String> res = new ArrayList<>();
        Iterator<String> iteratorA = aStream.iterator();
        Iterator<String> iteratorB = bStream.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            res.add(iteratorA.next());
            res.add(iteratorB.next());
        }
        return res.stream();


    }
}
