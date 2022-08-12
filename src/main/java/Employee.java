public class Employee {

    public String name;
    public String surname;
    public int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + name + " " + surname + " is " + salary);
    }
}
