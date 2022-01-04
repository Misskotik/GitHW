package lesson6.online.HW6;

public class Cat extends Animal {


    public Cat(String animalType, String name) {
        super (animalType, name, 0, 200);
    }
    @Override
        public void swim(int distanceSwim) {
        System.out.println(animalType + name + " can't swim!");
    }



    }




