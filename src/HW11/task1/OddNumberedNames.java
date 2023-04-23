// task 1

package HW11.task1;


import HW11.ReadFromFile;

import java.util.List;
import java.util.stream.IntStream;

public class OddNumberedNames {
//    Метод приймає на вхід список імен.
//    Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами,
//    що стоять під непарним індексом (1, 3 тощо)


public static void oddIndexNames() {
    ReadFromFile reader = new ReadFromFile("nameList.txt");
    List<String> nameList = reader.readNamesFromFile();
    IntStream.range(0, nameList.size())
            .filter(i -> i % 2 != 0)
            .forEach(i -> {
//            .map(name -> i + ". " + nameList.get(i)});
                System.out.println(i + ". " + nameList.get(i));
            }
            );
    
}

    public static void main(String[] args) {
    oddIndexNames();
//        writeFile();
//        parseFile("nameList");



    }
}
