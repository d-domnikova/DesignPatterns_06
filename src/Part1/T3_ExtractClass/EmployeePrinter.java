package Part1.T3_ExtractClass;

public class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
    }
}
