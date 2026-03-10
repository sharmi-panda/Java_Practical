import java.util.Scanner;

class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int id;
        double salary;

        // Input
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();

        // Output
        System.out.println("\nEmployee Details");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);

        sc.close();
    }
}