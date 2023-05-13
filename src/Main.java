public class Main {
    public static void main(String[] args) {

        carShow car1 = new carShow ("Toyota", "Camry", 2010);
        carShow  car2 = new carShow ("Honda", "Civic", 2021);
        carShow  car3 = new carShow ("Ford", "Mustang", 1969);


        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());
    }
}
