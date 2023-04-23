// task 4
package HW11.task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearCongruentGenerator {

    private long a, c, m;


    public LinearCongruentGenerator(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }



//    x[n + 1] = 1 (a * x[n] + c) % m
    public Long next(Long prev) {
        Long nextNumber = (a * prev + c) % m;
        return nextNumber;
    }

    public static void main(String[] args) {

        long a = 25214903917L;
        long c = 11;
        long m = 2^48;
        long seed = 12;

        LinearCongruentGenerator lge = new LinearCongruentGenerator(a, c, m);
        Stream<Long> longStream = Stream.iterate(seed, (prev) -> lge.next(prev));

        longStream
//                        .limit(15)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
