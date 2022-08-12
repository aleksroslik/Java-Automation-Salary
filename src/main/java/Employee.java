public class Employee {

    public String name;
    public String surname;
    public int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name: " + getName() + " surname: " + getSurname() + " is: " + getSalary();
    }
}
