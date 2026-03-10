import java.util.Scanner;

class CarDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carName, brand;
        double price;

        // Input
        System.out.print("Enter Car Name: ");
        carName = sc.nextLine();

        System.out.print("Enter Car Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Car Price: ");
        price = sc.nextDouble();

        // Output
        System.out.println("\nCar Details");
        System.out.println("Car Name: " + carName);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);

        sc.close();
    }
}