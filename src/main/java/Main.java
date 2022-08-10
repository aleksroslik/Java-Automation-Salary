import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
        Company company = new Company();

        System.out.println("Enter employee's NAME, SURNAME and SALARY:"); // mozna pozniej zmienic na 5 pracownikow
        for (int i=0; i<=5; i++) {
            employee.setName(input.next());
            employee.setSurname(input.next());
            employee.setSalary(input.nextInt());
        }

        menuSelect();

        int userInput = input.nextInt();

        /*switch (userInput) {
            case 1 -> // suma salary + menuSelect
            case 2 -> // dane wszystkich pracownikow + menuSelect
            case 3 -> // dodaj kolejnego pracownika + menuSelect
            case 4 -> {
                System.out.println("Closing program...");
                input.close();
            }
            default -> System.out.println("Please try again - enter 5, 10 or 15 - to get your token");
            }*/

        employee.getAllData();

        company.employeesList = new ArrayList<>();
        company.employeesList.add(new Employee());

    }
    public static void menuSelect() {
        System.out.println("Select from the following options:");
        System.out.println("1 - Print sum of all employees salary");
        System.out.println("2 - Display all employees data");
        System.out.println("3 - Add new employee");
        System.out.println("4 - End Program");
    }
}
