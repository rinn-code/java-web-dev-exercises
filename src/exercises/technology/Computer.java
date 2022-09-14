package exercises.technology;

public class Computer {
    private int storage;
    private int ram;
    private String brand;

    public Computer(int storage, int ram, String brand) {
        this.storage = storage;
        this.ram = ram;
        this.brand = brand;
    }

    public void makeNoise() {
        System.out.println("Beedoop!");
    }
    public void addRam(int ram){
        this.ram += ram;
    }
}
