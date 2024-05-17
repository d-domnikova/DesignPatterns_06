package Part5.T7_ExtractSuperclass;

public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}