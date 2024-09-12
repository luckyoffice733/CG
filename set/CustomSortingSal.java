package com.cg.training.set;

import java.util.Comparator;

public class CustomSortingSal implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		double es1 = o1.getEmpSal();
		double es2 = o2.getEmpSal();
		
		if(es1<es2) {
			return -1;
		}else if(es1>es2) {
			return 1;
		}else {
			return 0;
		}
		
		
	}

}
