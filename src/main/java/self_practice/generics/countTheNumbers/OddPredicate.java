package self_practice.generics.countTheNumbers;

public class OddPredicate implements UnaryPredicate<Integer>{

    @Override
    public boolean test(Integer a) {
        return a%2!=0;
    }
}
