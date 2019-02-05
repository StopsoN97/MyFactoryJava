package factory;

import interfaces.IAnimal;
import types.AnimalFactory;
import types.Animals;


public class Main {

    public static void main(String[] args) {
        IAnimal animal = AnimalFactory.createAnimalObject(Animals.DOG);
        animal.makeSound();
        
    }
}
