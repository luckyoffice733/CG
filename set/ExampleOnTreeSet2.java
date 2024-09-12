package com.cg.training.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleOnTreeSet2 {
	
	public static void main(String[] args) {
		CustomSortingSal css = new CustomSortingSal();
		TreeSet<Employee> ts = new TreeSet<>(css); //passing comparator object for custom sortin
		//Creating the employee object
		Employee e1 = new Employee();
		e1.setEmpId(1021);
		e1.setEmpName("smith");
		e1.setEmpSal(4000);
		
		Employee e2 = new Employee(1011,"allen",3000);
		Employee e3 = new Employee(2121,"sainath",44960);
		Employee e4 = new Employee(231,"fazil",23260);
        Employee e5 = new Employee(1021,"smith",4000);
		
		//adding employee objects  into tree set
		ts.add(e1);
		ts.add(e2);
		ts.add(e4);
		ts.add(e3);
		ts.add(e5);
		
		System.out.println("No of  objects : "+ts.size());
		System.out.println(ts);
		
		System.out.println("elements are : "+ts);
		System.out.println("Displaying the elements using iterator: ");
		Iterator<Employee> iobj=ts.iterator();
		while(iobj.hasNext()) {
			Employee et =iobj.next();
			System.out.println(et.getEmpId()+" "+et.getEmpName()+" "+et.getEmpSal());
		}
		
		
		
		
	}

}
