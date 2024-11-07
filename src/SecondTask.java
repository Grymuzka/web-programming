import java.util.Arrays;
import java.util.Random;

public class SecondTask {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
