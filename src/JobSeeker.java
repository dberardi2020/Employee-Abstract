public class JobSeeker {
    String jobSeekerID;
    String jobSeekerName;
    Recruiter recruiter;
    private float salary;

    public JobSeeker(String jobSeekerID, String jobSeekerName, Recruiter recruiter, float salary) {
        this.jobSeekerID = jobSeekerID;
        this.jobSeekerName = jobSeekerName;
        this.recruiter = recruiter;
        this.salary = salary;
    }

    public JobSeeker(String jobSeekerID, String jobSeekerName, Recruiter recruiter) {
        this.jobSeekerID = jobSeekerID;
        this.jobSeekerName = jobSeekerName;
        this.recruiter = recruiter;
    }

    String getJobSeekerID() {
        return jobSeekerID;
    }

    void setJobSeekerID(String jobSeekerID) {
        this.jobSeekerID = jobSeekerID;
    }

    String getJobSeekerName() {
        return jobSeekerName;
    }

    void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
    }

    Recruiter getRecruiter() {
        return recruiter;
    }

    void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }

    public float getSalary() {
        return salary;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return ("Job Seeker: " + jobSeekerName + ". Recruiter: " + recruiter.employeeName);
    }
}
