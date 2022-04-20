package Chapter9.Exercise1;

public class Faculty extends UEmployee{
    private String departmentName;

    public Faculty(String deptName, String empName, double salary) {
        super(empName,salary);
        this.departmentName = deptName;

    }
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department Name : "+this.getDepartmentName());
        sb.append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
