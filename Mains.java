class Employee {
    private int salary;
    private String name;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
public class Mains{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        emp1.setName("Charlie");
        System.out.println("Updated Name: " + emp1.getName());
        System.out.println(emp1);
        System.out.println(emp2);
    }
}