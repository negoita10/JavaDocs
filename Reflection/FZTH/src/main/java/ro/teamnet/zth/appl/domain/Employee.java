package ro.teamnet.zth.appl.domain;

/**
 * Created by Alexandru.Negoita on 7/12/2017.
 */
public class Employee {
    private long employeeid;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private long hire_number;
    private String job_id;
    private long salary;
    private long commision_pct;
    private long manager_id;
    private long department_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeid != employee.employeeid) return false;
        if (hire_number != employee.hire_number) return false;
        if (salary != employee.salary) return false;
        if (commision_pct != employee.commision_pct) return false;
        if (manager_id != employee.manager_id) return false;
        if (department_id != employee.department_id) return false;
        if (!first_name.equals(employee.first_name)) return false;
        if (!last_name.equals(employee.last_name)) return false;
        if (!email.equals(employee.email)) return false;
        if (!phone_number.equals(employee.phone_number)) return false;
        return job_id.equals(employee.job_id);
    }

    @Override
    public int hashCode() {
        int result = (int) (employeeid ^ (employeeid >>> 32));
        result = 31 * result + first_name.hashCode();
        result = 31 * result + last_name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + phone_number.hashCode();
        result = 31 * result + (int) (hire_number ^ (hire_number >>> 32));
        result = 31 * result + job_id.hashCode();
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        result = 31 * result + (int) (commision_pct ^ (commision_pct >>> 32));
        result = 31 * result + (int) (manager_id ^ (manager_id >>> 32));
        result = 31 * result + (int) (department_id ^ (department_id >>> 32));
        return result;
    }

    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getFirst_name() {
        return first_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", hire_number=" + hire_number +
                ", job_id='" + job_id + '\'' +
                ", salary=" + salary +
                ", commision_pct=" + commision_pct +
                ", manager_id=" + manager_id +
                ", department_id=" + department_id +
                '}';
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public long getHire_number() {
        return hire_number;
    }

    public void setHire_number(long hire_number) {
        this.hire_number = hire_number;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getCommision_pct() {
        return commision_pct;
    }

    public void setCommision_pct(long commision_pct) {
        this.commision_pct = commision_pct;
    }

    public long getManager_id() {
        return manager_id;
    }

    public void setManager_id(long manager_id) {
        this.manager_id = manager_id;
    }

    public long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(long department_id) {
        this.department_id = department_id;
    }
}
