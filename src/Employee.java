class Employee extends Human {
    double salary;
    String designation;

    void displayEmployeeDetails() {
        displayBasicInfo();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}