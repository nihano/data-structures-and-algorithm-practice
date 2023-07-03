package self_practice.lambda.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pellard", 55));

        Predicate<User> predicate = p->p.getLastName().startsWith("E");
        printName(users, predicate);
        System.out.println("************");
        Predicate<User> predicate2 = p->true;
        printName(users, predicate2);

    }

    public static void printName(List<User> users, Predicate<User> predicate) {
        for (User user : users) {
            if (predicate.test(user)) {
                System.out.println(user);
            }
        }
    }
}
