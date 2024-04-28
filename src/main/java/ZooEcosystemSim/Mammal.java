package ZooEcosystemSim;

public class Mammal extends Animal {



    public String name;
    public int age;

    public Mammal(String name, int age){
        this.name=name;
        this.age=age;
    }





    public static void main(String[] args) {

    }

    @Override
    public void eat() {
        System.out.println(" crunch ");
    }

    @Override
    public void sleep() {
        System.out.println("rawrrr");
    }

    @Override
    public void displayInfo() {

        System.out.println("Mammal information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void makeSound() {
        System.out.println("bsng bang");
    }
}
