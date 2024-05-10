package Part1.T6_RemoveMiddleMan;

public class Employee {
    private String name;
    private Department department;
    // Конструктор та інші методи класу...
    public String getDepartmentManagerName() {
        return department.getManagerName();
    }
}
