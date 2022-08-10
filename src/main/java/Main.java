import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        employee.setName(input.next());
        employee.setSurname(input.next()) ;
        employee.setSalary(input.nextInt());

    }
}
