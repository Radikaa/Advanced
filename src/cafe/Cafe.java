package cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (this.employees.size() < this.capacity) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                this.employees.remove(employee);
                return true;
            }
        }
        return false;
    }

    public Employee getOldestEmployee() {
        return this.employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        /*Employee oldestEmployee = new Employee("", 0, ""); //най-възрастния служител
        for (Employee employee : this.employees) {
            if (employee.getAge() > oldestEmployee.getAge()) {
                oldestEmployee = employee;
            }

        return oldestEmployee;*/

    }

    public Employee getEmployee(String name) {
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
        return this.employees.size();
    }

    //report() – returns a string in the following format:
    //o "Employees working at Cafe {cafeName}: {Employee1} {Employee2} (…)"

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employees working at Cafe " + this.name + ":").append(System.lineSeparator());
        this.employees.forEach(e -> sb.append(e.toString()).append(System.lineSeparator()));
        return sb.toString();
    }
}