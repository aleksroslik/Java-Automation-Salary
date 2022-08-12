import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner input = new Scanner(System.in);
        company.employeeList = new ArrayList<>();

        System.out.println("Please enter initial data for 5 employees, in order to access menu");

        for (int i = 0; i <= 4; i++) {
            System.out.println("Please enter employee name, surname and salary: ");
            company.employeeList.add(new Employee(input.next(), input.next(), input.nextInt()));
        }
        menuSelect();

        while (true) {
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    AtomicInteger sum = new AtomicInteger();
                    for (Employee employeeSalary : company.employeeList) {
                        sum.addAndGet(employeeSalary.getSalary());
                    }
                    System.out.println("Total amount of all salaries is: " + sum);
                    menuSelect();
                }
                case 2 -> {
                    for (int i = 0; i < company.employeeList.size(); i++)
                    System.out.println ("Salary for " + company.employeeList.get(i).toString());
                    menuSelect();
                }
                case 3 -> {
                    System.out.println("Please enter employee name, surname and salary: ");
                    company.employeeList.add(new Employee(input.next(), input.next(), input.nextInt()));
                    menuSelect();
                }
                case 4 -> {
                    System.out.println("Closing program...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please try again - select one of the options below:");
                    menuSelect();
                }
            }
        }
    }
    static void menuSelect() {
        System.out.println("Select from the following options:");
        System.out.println("1 - Print sum of all employees salary");
        System.out.println("2 - Display all employees data");
        System.out.println("3 - Add new employee");
        System.out.println("4 - End Program");
    }
}
