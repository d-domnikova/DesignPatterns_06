package Part1.T2_MoveField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private Map<Employee, Double> salaries;

    public Company(List<Employee> employees) {
        this.employees = employees;
        this.salaries = new HashMap<>();
    }

    public void setSalary(Employee employee, double salary){
        salaries.put(employee, salary);
    }

    public void printEmployeeSalaries() {
        for(var entry: salaries.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}