package sheridan.chrisnei.employeemanagementsystem.domain;

/**
 * A class that models an employee
 */
public class Employee {
    private String name;
    private Status status;
    private boolean trained;
    private boolean certified;

    public Employee() {
    }

    public Employee(String name, Status status, boolean trained, boolean certified) {
        this.name = name;
        this.status = status;
        this.trained = trained;
        this.certified = certified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }
}
