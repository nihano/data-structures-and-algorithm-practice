package self_practice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Green", 120);
        Apple apple2 = new Apple("Green", 200);
        Apple apple3 = new Apple("Red", 202);
        Apple apple4 = new Apple("Green", 230);
        Apple apple5 = new Apple("Green", 180);
        Apple apple6 = new Apple("Red", 210);
        Apple apple7 = new Apple("Red", 199);

        List<Apple> apples = new ArrayList<>(Arrays.asList(apple1, apple2, apple3, apple4, apple5, apple6, apple7));

        List<Apple> greenApples = findApples(apples, new GreenPredicate());
        List<Apple> heavyApples = findApples(apples, new HeavyPredicate());
        System.out.println(greenApples);
        System.out.println(heavyApples);

        List<Apple> greenApplesLambda = findApples(apples, apple -> apple.getColor().equalsIgnoreCase("green"));
        List<Apple> heavyApplesLambda = findApples(apples, apple -> apple.getWeight()>200);
        System.out.println(greenApplesLambda);

    }

    public static List<Apple> findApples(List<Apple> apples, Predicate<Apple> p){
       List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (p.test(apple)) greenApples.add(apple);
        }
        return greenApples;
    }


}
