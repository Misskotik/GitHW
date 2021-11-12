package lesson6.online.HW6;

public abstract class Animal {

    protected String animalType;
    protected String name;
    protected int maxSwim;
    protected int maxRun;


    public Animal(String animalType, String name, int maxSwim, int maxRun) {
        this.animalType = animalType;
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }

        public abstract void swim(int distanceSwim);

    public void run(int distanceRun) {

        if (distanceRun <= maxRun && distanceRun>0) {
            System.out.println(animalType + name +" runs " + distanceRun + " m");
        } else if (distanceRun <0) {
            System.out.println("Error! Distance should have positive meaning");

        } else{
            System.out.println("Error!" + animalType + " can't run more than " + maxRun + " m");
        }

        }
    }


