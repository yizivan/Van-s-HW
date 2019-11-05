public class Employee
{
    private String firstname, lastname;
    private double salary;
    public Employee()
    {
        
    }

    public Employee(String fn,String ln,double sla)
    {
        firstname = fn;
        lastname = ln;
        if (sla >= 0)
            salary = sla;
    }
    public void setFirstname(String fn) 
    {   
        firstname = fn;
    }
    
    public void setLastname(String ln)
    {
        lastname = ln;
    }
    
    public void setSalary(double sla)
    {
        salary = sla;
    }
    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public double getSalary()
    {
        return salary;
    }
}