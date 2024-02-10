package random.question;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal(1, "Mammals", "Tiger", 6);
        Animal whale = new Animal(2, "Mammals", "Whale", 8);
        Animal whale2 = new Animal(3, "Mammals", "Whale", 8);

        Zoo zoo = new Zoo();
        IAnimal animal = new Animal();
        animal.setId(1);
        animal.setName("Joe");
        animal.setAge(12);
        animal.setSpecies("Mammal");
        zoo.addAnimal(animal);


        System.out.println(zoo);
        System.out.println(zoo.countAnimals());


        System.out.println(zoo.getAnimalsBySpecies("Mammals"));

        System.out.println("-------------");
        System.out.println(zoo.getAnimalsByAge());
    }
}
