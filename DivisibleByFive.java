/* Question: Write a java program using a stream to filter the numbers that are divisible by 5 from the
   following ArayList and print them out. [10]
   (1, 4, 5, 20, 30, 6) */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByFive {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));


        List<Integer> divisibleByFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println("The numbers divisible by 5: " + divisibleByFive);
    }
}
