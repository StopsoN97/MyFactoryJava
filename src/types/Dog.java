package types;

import interfaces.IAnimal;


public class Dog implements IAnimal{
    
    @Override 
    public void MakeSound(){
        System.out.println("HAUUUUU");
    }
}
