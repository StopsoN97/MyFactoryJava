package types;

import interfaces.IAnimal;


public class Cow implements IAnimal{
    
    @Override 
    public void MakeSound(){
        System.out.println("MUUUUUUU");
    }
}
