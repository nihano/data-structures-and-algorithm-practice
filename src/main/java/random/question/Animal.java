package random.question;


public class Animal implements IAnimal {
    private int id;
    private String species;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(int id, String species, String name, int age) {
        this.id = id;
        this.species = species;
        this.name = name;
        this.age = age;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
