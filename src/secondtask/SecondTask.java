package secondtask;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// 2
public class SecondTask {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int liczbaMin = 23;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        Arrays.stream(numbers).forEach(System.out::println);

        System.out.println(Arrays.stream(numbers).sum());

        System.out.println(
                Arrays.stream(numbers)
                        .filter(number -> number > liczbaMin)
                        .sum()
        );

        System.out.println(
                Arrays.stream(numbers)
                        .filter(number -> number > liczbaMin)
                        .sum()
        );

        System.out.println(
                IntStream.range(0, numbers.length)
                        .filter(index -> index % 2 == 0)
                        .map(index -> numbers[index])
                        .sum()
        );


    }
}
