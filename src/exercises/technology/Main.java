package exercises.technology;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer(1024, 16, "Lenovo");
        Laptop laptop = new Laptop(2000, 8, "HP", false);
        SmartPhone smartPhone = new SmartPhone(512, 4, "Apple", "8675309");
       /* System.out.println(computer.getBrand());
        System.out.println(laptop.getBrand());
        System.out.println(smartPhone.getBrand());*/
    }
}

