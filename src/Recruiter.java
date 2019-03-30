import java.util.*;

public class Recruiter extends Employee {
    protected ArrayList<JobSeeker> jobSeekers = new ArrayList<>();

    public Recruiter(String employeeName, Manager manager, int recruiterID) {
        super(employeeName, manager, recruiterID);
    }

    public Recruiter(String employeeName, Manager manager, int recruiterID, ArrayList<JobSeeker> jobSeekers) {
        super(employeeName, manager, recruiterID);
        this.jobSeekers = jobSeekers;
    }

    public void addJobSeeker(JobSeeker js) {
        jobSeekers.add(js);

        jobSeekers.sort((js1, js2) -> js1.jobSeekerName.compareTo(js2.jobSeekerName));
    }

    public ArrayList<JobSeeker> getJobSeekers() {
        return jobSeekers;
    }

    double bonus() {
        return (100 * jobSeekers.size());
    }

    public String toString() {
        String finalString;
        finalString = ("Recruiter: " + employeeName + ".  Manager: " + manager.employeeName + ". Job Seekers: ");

        if (jobSeekers.isEmpty()) {
            finalString += "None.  ";
        } else {
            int i = 1;
            for (JobSeeker j : jobSeekers) {
                finalString += (j.jobSeekerName + " " + j.jobSeekerID + (i < jobSeekers.size() ? ", " : ". "));
                i++;
            }
        }

        finalString += ("Bonus: " + bonus());

        return finalString;
    }
}
