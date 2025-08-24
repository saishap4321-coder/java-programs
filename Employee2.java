//Constructor Overloading concept 

import java.util.*;

public class Employee2
{
     int Salary , emp_id;
     String department ,Name;
     
    //Constructor 1
    Employee2()
    {
         emp_id=23;
         Salary=30000;
         Name="Siddhi";
         department="IT";
	System.out.println("\nEmployee Salary : "+emp_id+ "\nEmployee Salary : "+Salary);
    }
   
    //Constructor 2

     Employee2(int id , int Sal )
     {
             emp_id=id;
	     Salary=Sal;
             System.out.println("\nEmployee Id : "+emp_id+ "\nEmployee Salary : "+Salary);
     }

   //Constructor 3
   
        Employee2(int id , String n , String d )
     {
             emp_id=id;
	     department=d;
             Name=n;
           
             System.out.println("\nEmployee Id : "+emp_id+ "\nEmployee Department : "+department+"\nEmployee Name : "+Name);
     }

  
public static void main(String[] args)
     {		
		//Concept of Constructor Overloading 
     		Employee2 e =new Employee2();
   	 	Employee2 e1 =new Employee2(12,10000);
    	        Employee2 e3 =new Employee2(54,"Siya","Computer");
      }

}
  

    
             