// task 3

package HW11.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {
//    Є масив:
//
//["1, 2, 0", "4, 5"]
//
//Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
//
//"0, 1, 2, 4, 5"


    List<String> numberStart;// = new ArrayList<>();
//    numberStart = {"1, 2, 0", "4, 5"};


    public SortedNumbers(List<String> numberStart) {
        this.numberStart = numberStart;
    }


    public List<String> sortNumbersFromArray () {
        List<String> operated =  numberStart.stream()
                .map(s -> s.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.toList());

        return operated;
    }

//    public void listSortedToConsole () {
//        numberStart.stream()
//                .map(s -> s.split(", "))
//                .flatMap(Arrays::stream)
//                .sorted()
////                .peek(System.out::println)
//                .peek(p -> System.out.print(p + ", "))
//                .collect(Collectors.toList());
//    }

    public static void main(String[] args) {


        SortedNumbers sn = new SortedNumbers(Arrays.asList("1, 2, 0", "4, 5"));

        System.out.println("sorted numbers are: " + sn.sortNumbersFromArray());
//        sn.listSortedToConsole();
    }
}
