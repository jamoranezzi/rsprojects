package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by amorales on 23/09/16.
 */
public class ExpLambdaRepaso2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Normalmente seria algo asi
        for (int i : numbers) {
            System.out.println("Normal : " + i);
        }

        //Con expresiones Lambda
        numbers.forEach(x -> System.out.println("Lambda : " + x));
        numbers.forEach(System.out::println);


        //====================EJEMPLO2=====================

        int result = 0;

        // Normalmente
        for (int e : numbers) {
            result += e * 2;
        }
        System.out.println(result);

        // con expresiones lambda

        System.out.println(numbers.stream().map(e -> e * 2).
                reduce((c, e) -> e + c));

        //===================EJEMPLO3========================

        System.out.println(
                numbers.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst());

    }

}
