package Chapter9.Exercise1;

public class Staff extends UEmployee{
    private String jobTitle;
    
    public Staff(String jobTitle, String empName, double salary) {
        super(empName,salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Job Title : "+this.getJobTitle());
        sb.append("\n");
        sb.append(super.toString());
        return sb.toString();
    }    
}
