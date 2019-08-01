package design_patterns.structional.flyweight;

public class Test {
    public static final String[] DEPARTMENT = {"AD","BD","CD","DD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Employee manager = EmployeeFactory.getManager(DEPARTMENT[(int) Math.random() * DEPARTMENT.length]);
            manager.report();
        }
    }
}
