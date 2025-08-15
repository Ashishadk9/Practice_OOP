public class Main {
    public static void main(String[]args){
        // Animal reference point
        Animal animal=new Dog();
        // Safe type check before call subclass methods
        if (animal instanceof Dog){
            Dog myDog = (Dog) animal;
            myDog.bark(); //Safe call
        } else {
            animal.makeSound();
        }
    }
}