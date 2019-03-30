import java.util.*;

public class Manager extends Employee {
    protected ArrayList<Employee> employees = new ArrayList<>();

    public Manager(String employeeName, Manager manager, int recruiterID, ArrayList<Employee> employees) {
        super(employeeName, manager, recruiterID);
        this.employees = employees;
    }

    public Manager(String employeeName, Manager manager, int recruiterID) {
        super(employeeName, manager, recruiterID);
    }

    public Manager(String employeeName, int recruiterID) {
        super(employeeName, recruiterID);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    double bonus() {
        return (1000 * employees.size());
    }

    /**
     * @return
     */
    public String toString() {
        String finalString;
        finalString = ("Manager: " + employeeName + ".  Employees: ");
        if (employees.isEmpty()) {
            finalString += "None.  ";
        } else {
            int i = 1;
            for (Employee e : employees) {
                finalString += (e.employeeName + " " + e.recruiterID + (i < employees.size() ? ", " : ". "));
                i++;
            }
        }

        finalString += ("Bonus: " + bonus());

        return finalString;
    }
}
