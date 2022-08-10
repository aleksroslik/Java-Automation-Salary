public class Employee {

    public String name;
    public String surname;
    public int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee() {

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

    public void setAllData(String name, String surname, int Salary) {
        this.name = getName();
        this.surname = getSurname();
        this.salary = getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + name + " " + surname + " is " + salary);
    }
}
