class Wipro {
    String empName;
    int empId;
    String empDept;
    double empSalary;
    Wipro() {}
    Wipro(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }

    public void employeeInfo() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Department: " + empDept);
        System.out.println("Employee Salary: " + empSalary);
    }
    public double getSalary() {
        return empSalary = 10;
    }
}
class WiproTech extends Wipro {
    WiproTech(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }
    public double getSalary() {

        return empSalary = 8;
    }
}
class WiproInfo extends Wipro {
    WiproInfo(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }
    public double getSalary() {

        return empSalary = 6;
    }
}
class WiproBPO extends Wipro {
    WiproBPO(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }
    public double getSalary() {

        return empSalary = 3;
    }
}

class wipro1 {
    public static void main(String[] args) {
        Wipro w = new Wipro("Jagan", 1, "Manager");
        WiproTech wt = new WiproTech("Sanjay", 2, "Software Developer");
        WiproInfo wi = new WiproInfo("Sarath", 3, "Software Tester");
        WiproBPO wb = new WiproBPO("Santhosh", 4, "Software Maintenance");
        System.out.println("Employee Salary in Wipro: " + w.getSalary() + " LPA");
        System.out.println("Employee Salary in WiproTech: " + wt.getSalary() + " LPA");
        System.out.println("Employee Salary in WiproInfo: " + wi.getSalary() + " LPA");
        System.out.println("Employee Salary in WiproBPO: " + wb.getSalary() + " LPA");
    }
}