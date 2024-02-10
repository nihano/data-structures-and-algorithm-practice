package random.question;

import lombok.*;

import java.util.*;

@Getter
@Setter
@ToString
public class Zoo implements IZoo {
    private List<IAnimal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void addAnimal(IAnimal animal) {
        animals.add(animal);
    }

    @Override
    public void removeAnimal(int id) {
        animals.removeIf(animal -> animal.getId() == id);
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }

    @Override
    public List<IAnimal> getAnimalsBySpecies(String species) {
        List<IAnimal> animalsBySpecies = new ArrayList<>();
        for (IAnimal animal : animals) {
            if (animal.getSpecies().equals(species)) {
                animalsBySpecies.add(animal);
            }
        }
        return animalsBySpecies;
    }

    @Override
    public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge() {
        Map<Integer, List<IAnimal>> animalsByAge = new HashMap<>();
        for (IAnimal animal : animals) {
            int age=animal.getAge();
            if (!animalsByAge.containsKey(age)){
                animalsByAge.put(age,new ArrayList<>(Arrays.asList(animal)));
            }else{
                List<IAnimal> updatedList = animalsByAge.get(age);
                updatedList.add(animal);
                animalsByAge.put(age, updatedList);
            }
        }
        return new ArrayList<>(animalsByAge.entrySet());
    }

//    @Override
//    public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge() {
//        Map<Integer, List<IAnimal>> animalsByAge = new HashMap<>();
//
//        for (IAnimal animal : animals) {
//            int age = animal.getAge();
//            animalsByAge.computeIfAbsent(age, k -> new ArrayList<>()).add(animal);
//        }
//
//        return new ArrayList<>(animalsByAge.entrySet());
//    }
}
