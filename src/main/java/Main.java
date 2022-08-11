import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner input = new Scanner(System.in);
        company.name = new ArrayList<String>();
        company.surname = new ArrayList<String>();
        company.salary = new ArrayList<Integer>();

        System.out.println("Please enter initial data for 5 employees, in order to open menu");

        for (int i = 0; i <= 4; i++) {
            System.out.println("Please enter employee name: ");
            company.name.add(input.next());
            System.out.println("Please enter employee surname: ");
            company.surname.add(input.next());
            System.out.println("Please enter employee's salary: ");
            company.salary.add(input.nextInt());
        }

        menuSelect();

        int userInput = input.nextInt();

        switch (userInput) {
            case 1 -> {
                AtomicInteger sum = new AtomicInteger();
                for(int j = 0; j < company.salary.size(); j++) {
                    sum.addAndGet(company.salary.get(j));
                }
                System.out.println("total amount of salaries is: " + sum);
            }
            case 2 -> {
                for (int i = 0; i < company.name.size() && i < company.surname.size() && i < company.salary.size(); i++)
                System.out.println
                        ("Salary for " + company.name.get(i) + company.surname.get(i) + " is " + company.salary.get(i));
                menuSelect();
            }
            case 3 -> enterData();
            case 4 -> {
                System.out.println("Closing program...");
                input.close();
            }
            default -> System.out.println("Please try again - select one of the options below:"); //todo powrot do poczatku?
        }
    }

    public static void enterData() {
        Company company = new Company();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter employee name: ");
        company.name.add(input.next());
        System.out.println("Please enter employee surname: ");
        company.surname.add(input.next());
        System.out.println("Please enter employee's salary: ");
        company.salary.add(input.nextInt());
    }

    public static void menuSelect() {
        System.out.println("Select from the following options:");
        System.out.println("1 - Print sum of all employees salary");
        System.out.println("2 - Display all employees data");
        System.out.println("3 - Add new employee");
        System.out.println("4 - End Program");
    }
}
