import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExercises {
    public static void main(String[] args) {
        System.out.println("Exercise 1:");

        MathOperation add = (int a, int b) -> a + b;
        System.out.println("Addition: " + add.operation(5, 3));

        MathOperation subtraction = (int a, int b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operation(5, 3));

        MathOperation multiplication = (int a, int b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operation(5, 3));

        MathOperation division = (int a, int b) -> a / b;
        System.out.println("Division: " + division.operation(5, 3) + "\n");

        System.out.println("Exercise 2:");

        Predicate<Integer> isOdd = (n) -> n % 2 == 1;
        List<Integer> nums = Arrays.asList(10, 15, 22, 33, 40, 55);
        System.out.println(nums);
        nums.forEach((n) -> {
            if (isOdd.test(n)) {
                System.out.println("odd num in the array " + n);
            }
        });
        System.out.println("\n");


        System.out.println("Exercise 3:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println(names + "\n");


        System.out.println("Exercise 4:");

        List<String> words = Arrays.asList("hello", "java", "lambda");
        System.out.println("given words: " + words);
        words.forEach((word) -> {
            String reversed = new StringBuilder(word.toUpperCase()).reverse().toString();
            System.out.println("Transformed String = " + reversed);
        });
        System.out.println("\n");

        System.out.println("Exercise 5:");
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> c = (city) -> System.out.println(city);
        cities.forEach(c);
        System.out.println("\n");

        System.out.println("Exercise 6:");
        cities.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Exercise 7:");

        BiFunction<Integer, Integer, Integer> min = (a, b) -> {if(a < b) return a; else return b;};
        System.out.println("Min = " + min.apply(5, 3));
        BiFunction<Integer, Integer, Integer> max = (a, b) -> {if(a > b) return a; else return b;};
        System.out.println("Max = " + max.apply(5, 3));

    }
}

interface MathOperation {
    int operation(int a, int b);
}
