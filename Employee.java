
package oops;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        EmployeeDetails[] obj =new EmployeeDetails[2];
       Scanner o=new Scanner(System.in);
       int emp_id,age, salary;  
       String name, department, designation;
       for(int i=0;i<obj.length;i++)
       {
           obj[i]=new EmployeeDetails();
           System.out.println("Enter Name:");
           name=o.next();
           obj[i].setName(name);
           System.out.println("Enter ID:");
           emp_id=o.nextInt();
           obj[i].setEmp_id(emp_id);
           System.out.println("Enter Age:");
           age=o.nextInt();
           obj[i].setage(age);
           System.out.println("Enter Designation:");
           designation = o.next();
           obj[i].setdesignation(designation);
           System.out.println("Enter Department:");
           department=o.next();
           obj[i].setDepartment(department);
           System.out.println("Enter Salary:");
           salary=o.nextInt();
           obj[i].setSalary(salary);
           System.out.println();
           System.out.println();
           
       }
       for(int i=0;i<obj.length;i++){
           System.out.println(obj[i]);
           System.out.println();
           System.out.println();
       }
       System.out.println("Employee Details whose salary is more than 10000 and belongs to CSE department");
       for(int i=0;i<obj.length;i++){
           if(obj[i].department.equals("cse") && 10000<obj[i].salary){
               System.out.println(i+1+":"+"Employee Name:"+obj[i].name);
               System.out.println(i+1+":"+"Employee Designation:"+obj[i].designation);
               System.out.println();

           }
       }
    }
    
}
class EmployeeDetails {  
    //Creating properties of Employee class  
int emp_id,age, salary;  
String name, department, designation;  
  
//Getter and setters for getting and setting properties  
public int getEmp_id() {  
    return emp_id;  
}  
public void setEmp_id(int emp_id) {  
    this.emp_id = emp_id;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public int getage() {  
    return age;  
}  
public void setage(int age) {  
    this.age = age;  
}  
public String getDepartment() {  
    return department;  
}  
public void setDepartment(String department) {  
    this.department = department;  
}  
public String designation() {  
    return designation;  
}  
public void setdesignation(String designation) {  
    this.designation = designation;  
}  
@Override
public String toString() {  
    return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", age = " + age  
            + ", department = " + department + ", designation = " + designation+ "]";  
    }  
      
}  