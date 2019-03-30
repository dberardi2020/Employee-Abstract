public abstract class Employee {
    protected String employeeName;
    protected Manager manager;
    protected int recruiterID;

    public Employee(String employeeName, Manager manager, int recruiterID) {
        this.employeeName = employeeName;
        this.manager = manager;
        this.recruiterID = recruiterID;
    }

    public Employee(String employeeName, int recruiterID) {
        this.employeeName = employeeName;
        this.recruiterID = recruiterID;
    }


    /**
     * GETTERS and SETTERS start here
     */
    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    Manager getManager() {
        return manager;
    }

    void setManager(Manager manager) {
        this.manager = manager;
    }

    int getRecruiterID() {
        return recruiterID;
    }

    void setRecruiterID(int recruiterID) {
        this.recruiterID = recruiterID;
    }

    /**
     * GETTERS and SETTERS end here
     */

    abstract double bonus();
}
