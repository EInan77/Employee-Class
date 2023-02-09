/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.mavenproject1;

/**
 *
 * @author ereni
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 =
                new Employee("Jake", "Mike", 55000);
        
        Employee emp2 =
                new Employee("Mike", "Smith", 60000);
        System.out.println("Emp1 Name:"+emp1.getFname()+ " "+emp1.getLname());
        System.out.printf("Emp1 Salary:"+emp1.getSalary()+'\n'+"");
        
       System.out.println("Emp2 Name:"+emp2.getFname()+" "+emp2.getLname());
        System.out.println("Emp2 Salary:"+emp2.getSalary());
       
        emp1.setSalary(emp1.getSalary()*1.10);
        emp2.setSalary(emp2.getSalary()*1.10);
        System.out.println("Updated Employee salary");
        System.out.println("Emp1 Name:"+emp1.getFname()+" "+emp1.getLname());
        System.out.println("Emp1 Salary:"+emp1.getSalary());
        System.out.println("Emp2 Name:"+emp2.getFname()+" "+emp2.getLname());
        System.out.println("Emp2 Salary:"+emp2.getSalary());
        
}}
