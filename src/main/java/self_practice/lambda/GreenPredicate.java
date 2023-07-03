package self_practice.lambda;

import java.util.function.Predicate;

public class GreenPredicate implements Predicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("green");
    }
}
