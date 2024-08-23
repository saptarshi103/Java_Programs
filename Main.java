interface LivingBeing {
    default void breathe() {
        System.out.println("The living being is breathing");
    }
}

interface Animal extends LivingBeing {
    default void eat() {
        System.out.println("The Animal is eating");
    }
}

class Dog implements Animal {
   public void x() {
        System.out.println("The Animal is eating");
    }

}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe(); 
        dog.eat();  
        dog.x();
    }
}
