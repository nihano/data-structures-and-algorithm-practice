package self_practice.stream;

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .forEach(i-> System.out.println(i.getName()));

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .forEach(i-> System.out.print(i.getName().length()));

        System.out.println();
        DishData.getAll().stream()
                .map(i->i.getName().length())
                .forEach(System.out::print);
        System.out.println();

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                //.sorted(comparing(dish->dish.getCalories()).reversed())  cannot resolve getWeight method==>CHECK jpg for StackOverflow answer
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .forEach(System.out::println);
    }
}
