package Chapter9.Exercise1;

class UEmployee {
    private String name;
    private double salary;

    public UEmployee(){}
    public UEmployee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee Name : "+this.getName());
        sb.append("\n");
        sb.append("Salary : $"+this.getSalary());
        return sb.toString();
    }
}