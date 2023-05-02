package Module12.HomeWork12.task2;

import Module12.HomeWork12.task2.ExecuteProcessor;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzThreads {

    public static void main(String[] args) {
        ExecuteProcessor fizzProcessor = new ExecuteProcessor((n) -> {
            if(n%3 == 0 && n%5 != 0) {
                System.out.print("fizz, ");
            }
        });

        ExecuteProcessor buzzProcessor = new ExecuteProcessor((n) -> {
            if(n%5 == 0 && n%3 != 0) {
                System.out.print("buzz, ");
            }
        });

        ExecuteProcessor fizzBuzzProcessor = new ExecuteProcessor((n) -> {
            if(n%5 == 0 && n%3 == 0) {
                System.out.print("fizzbuzz, ");
            }
        });

        ExecuteProcessor defaultProcessor = new ExecuteProcessor((n) -> {
            if(n%5 != 0 && n%3 != 0) {
                System.out.print(n + ", ");
            }
        });

        List<ExecuteProcessor> pt = new ArrayList<>();
        pt.add(fizzProcessor);
        pt.add(buzzProcessor);
        pt.add(fizzBuzzProcessor);
        pt.add(defaultProcessor);

        for (ExecuteProcessor thread: pt) {
            thread.start();
        }

        for (int i = 1; i < 101; i++) {
            for (ExecuteProcessor thread : pt) {
                thread.process(i);
            }
            /* to wait while all 4 threads are executed: */
            while (true) {
                int processCount = 0;
                for (ExecuteProcessor thread: pt) {
                    if(thread.getIsProcessed().get()) { processCount++; }
                }

                if (processCount == pt.size()) { break; }
            }
        }

        System.exit(0);

    }
}


