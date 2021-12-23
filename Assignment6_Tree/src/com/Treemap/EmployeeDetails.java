package com.Treemap;

import java.util.*;

public class EmployeeDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> set = new TreeSet<Employee>();
		
		Employee e1 = new Employee(1001,"bhavya", "IT", 20000);
		Employee e2 = new Employee(1002,"latha", "Finance", 25000);
		Employee e3= new Employee(1003,"sai", "Admin", 30000);
		Employee e4 = new Employee(1004,"krishna", "IT", 40000);
		Employee e5= new Employee(1005,"rashmi", "IT", 45000);
		Employee e6 = new Employee(1006,"pavani", "Suport", 32000);
		Employee e7 = new Employee(1007,"vijaya", "finance", 28000);
		Employee e8 = new Employee(1008,"vamshi", "Admin", 50000);
		Employee e9= new Employee(1009,"bhavitha", "IT", 55000);
		Employee e10 = new Employee(1010,"srilatha", "IT", 60000);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
	
		for(Employee e:set)
		{
			System.out.println("id:" +e.id+" Name:"+e.name+" Department:" +e.department+" Salary:" +e.salary);
			
		}
	}
		
		  
	      
	 
}
class Employee implements Comparable<Employee>
{
		  String name;
		  int id;
		  int salary;
		  String department;
		 
		     public Employee(int id, String name, String department,  int salary)
		    {
		        this.name = name;
		        this.id = id;
		        this.salary = salary;
		        this.department = department;
		    }
		        
		        public int getId() {
		        	return this.id;
		    }
		        public String getName() {
		        	return this.name;
		        }
		        public String getDepartment() {
		        	return this.department;
		        }

				@Override
				public int compareTo(Employee o) {
					// TODO Auto-generated method stub
					return this.getName().compareTo(o.getName());
				}
		        
		        
	}






		

	


