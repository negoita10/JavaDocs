package ro.teamnet.zth.appl.domain;

/**
 * Created by Alexandru.Negoita on 7/12/2017.
 */
public class Job {
    private String jobid;
    private String jobtitle;
    private long min_salary;
    private long max_salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (min_salary != job.min_salary) return false;
        if (max_salary != job.max_salary) return false;
        if (!jobid.equals(job.jobid)) return false;
        return jobtitle.equals(job.jobtitle);
    }

    @Override
    public int hashCode() {
        int result = jobid.hashCode();
        result = 31 * result + jobtitle.hashCode();
        result = 31 * result + (int) (min_salary ^ (min_salary >>> 32));
        result = 31 * result + (int) (max_salary ^ (max_salary >>> 32));
        return result;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobid='" + jobid + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                '}';
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public long getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(long min_salary) {
        this.min_salary = min_salary;
    }

    public long getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(long max_salary) {
        this.max_salary = max_salary;
    }
}
