package types;

import interfaces.IAnimal;

    public class AnimalFactory {

    public static IAnimal createAnimalObject(Animals animalType) {
       
        IAnimal animal;
        switch (animalType)
        {
            case CAT:
                animal = (IAnimal) new Cat();
                break;
            case COW:
                animal = (IAnimal) new Cow();
                break;
            case DOG:
                animal = (IAnimal) new Dog();
                break;
            default:
                throw new IllegalArgumentException("Undefinded animal type.");
        }
        return animal;
        
    }
    
}
