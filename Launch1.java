/*
 * 1. Create a superclass called Animal with a method makeSound() that prints the sound made by the animal. Implement subclasses Dog, Cat, and Cow that inherit from the Animal class. Implement the makeSound() method in each subclass to print the sound made by a dog, cat, and cow, respectively.
 */

class Animal{
    public void makeSound(){
        System.out.println("This is Super class-");
        System.out.println("Dog: Barks");
        System.out.println("Cat: Meows");
        System.out.println("Cow: Moos");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("This is dog class and Dog: Barks");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("This is cat class and Cat: Meows");
    }
}
class Cow extends Animal{
    public void makeSound(){
        System.out.println("This cow class and Cow: Moos");
    }
}

class Launch1 {
    public static void main(String[] args) {
        //Super class
        Animal a = new Animal();
        a.makeSound();
        System.out.println("");

        //Subclasses
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
        Animal cow = new Cow();
        cow.makeSound();
    }
    
}