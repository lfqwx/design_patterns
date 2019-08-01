package design_patterns.structional.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    //存放部门，员工
    public static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理：" + department);
            String reportContent = department + "部门经理开始做报告,内容为:";
            manager.setReportContent(reportContent);
            System.out.println("创建报告：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
