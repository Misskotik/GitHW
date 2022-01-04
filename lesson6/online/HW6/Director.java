package lesson6.online.HW6;

public class Director {
    public static void main (String [] args) {

Cat cat = new Cat ("cat", "Kitty");
Cat catPumpon = new Cat ("cat", "Pumpon");


Dog dog = new Dog (" dog", "Snoop");
Dog dogSharik = new Dog ("dog", "Sharik");

        cat.swim (0);
        cat.run (1);
        catPumpon.swim (0);
        catPumpon.run (150);

        dog.swim (5);
        dog.run (500);
        dogSharik.swim (11);
        dogSharik.run (400);
    }
}
