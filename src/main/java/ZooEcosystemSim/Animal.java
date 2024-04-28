package ZooEcosystemSim;

abstract public class Animal implements AnimalBehaviour {

    int age;

    public void sleep() {
        System.out.println("Zzz...");
    }


    abstract public void displayInfo();

}
