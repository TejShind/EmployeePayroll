package com.blz.model;

public class EmployeePayroll {

    /**
     * employeeId: ID of Employee. employeeName: Name of Employee. employeeSalary:
     * Salary of Employee.
     */
    private String employeeName;
    private int employeeId;
    private double employeeSalary;

    /**
     * Constructor
     *
     * @param employeeId:     ID of Employee.
     * @param employeeName:   Name of Employee.
     * @param employeeSalary: Salary of Employee.
     */
    public EmployeePayroll(String employeeName,int employeeId, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    /**
     * This method is Collecting the data From Employee
     */


    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}


