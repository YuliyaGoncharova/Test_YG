// task 2
package HW11.task2;

import HW11.ReadFromFile;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedUppercasedWords {
//    Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
//    Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).

    private List<String> nameList;




    SortedUppercasedWords(String filename) {
        ReadFromFile reader = new ReadFromFile(filename);
        this.nameList = reader.readNamesFromFile();
//        Stream<String> sortedNames = nameList;
    }

    public List<String> upperCaseAndSort() {
        Stream<String> sortedNames = this.nameList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder());
        List<String> performed = sortedNames.collect(Collectors.toList());

        return performed;
    }



    public static void main(String[] args) {

        SortedUppercasedWords sorted1 = new SortedUppercasedWords("nameList.txt");

        System.out.println("sortedNames = " + sorted1.upperCaseAndSort());
    }
}
