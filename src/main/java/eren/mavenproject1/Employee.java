/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.mavenproject1;

/**
 *
 * @author ereni
 */
public class Employee {

   private String fname;
   private String lname;
   private double salary;

public Employee(){
    fname="none";
    lname="none";
    salary=0.0;
}
public Employee(String fn, String ln, double s){
    fname = fn;
    lname = ln;
    salary = s;
}

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

   
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0.0){
            this.salary=salary;
        }
        else{
            this.salary=0.0;
        }
    }
}