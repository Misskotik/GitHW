package lesson6.online.HW6;

public class Dog extends Animal {


    public Dog(String animalType, String name) {
        super(animalType, name, 10, 500);

    }
    @Override
    public void swim(int distanceSwim) {
    if (distanceSwim <= maxSwim && distanceSwim>0) {
        System.out.println(animalType + name + " swims " + distanceSwim + " m");
    } else if (distanceSwim <0) {
            System.out.println("Error! Distance should have positive meaning");
    } else {
        System.out.println("Error! Dog can't swim more than " + maxSwim + " m");
    }
    }




        }







