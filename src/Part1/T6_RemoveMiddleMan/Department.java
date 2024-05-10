package Part1.T6_RemoveMiddleMan;

public class Department {
    private String name;
    private Employee manager;

    // Конструктор та інші методи класу...
    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}