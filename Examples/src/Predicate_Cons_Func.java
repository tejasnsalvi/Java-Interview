import java.util.Locale;
import java.util.function.*;

public class Predicate_Cons_Func {

    public static void main(String... args) {

        System.out.println("Predicate Returns boolean");
        Predicate<Integer> predicate = (a) -> a > 5;
        System.out.println(predicate.test(6));

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(5, 4));

        System.out.println("Consumer Returns Nothing");
        Consumer<String> consumer = (a) -> System.out.println(a.length());
        consumer.accept("Hello");

        BiConsumer<Integer, String> biConsumer = (a, b) -> System.out.println(a.intValue() + " & " + b.toLowerCase(Locale.ROOT));
        biConsumer.accept(5, "LOWER");

        System.out.println("Function you can specify the Return Type");
        Function<String, Integer> function = (a) -> a.length();
        System.out.println(function.apply("java"));

        BiFunction<String, Integer, Boolean> biFunction = (a, b) -> {
            return a.length() > 0 && b > 5 ? true : false;
        };
        System.out.println(biFunction.apply("fun", 10));


    }
}
