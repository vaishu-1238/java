class Employees {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 75000, "IT");
        mgr.displayInfo();
    }
}
class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}