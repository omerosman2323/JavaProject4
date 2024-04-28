package ZooEcosystemSim;

public class Bird extends Animal{
    public static void main(String[] args) {



    }

    @Override
    public void eat() {

        System.out.println(" nibble ");

    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzzzzzzz");
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird information:");
    }

    @Override
    public void makeSound() {

        System.out.println("kaaka kaaka ");

    }
}
