package self_practice.lambda;

import java.util.function.Predicate;

public class HeavyPredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
