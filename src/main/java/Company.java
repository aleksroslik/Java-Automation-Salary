import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    public ArrayList<Employee> employeeList;

    public void salariesTotal() {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        System.out.println("Total amount of all salaries is: " + sum);
    }

    public void addNewEmployee() {
        Scanner input = new Scanner(System.in);
        employeeList.add(new Employee(input.nextLine(), input.nextLine(), input.nextInt()));
    }

    public void printAllEmployees() {
        for (Employee employee : employeeList) System.out.println("Salary for " + employee.toString());
    }
}
