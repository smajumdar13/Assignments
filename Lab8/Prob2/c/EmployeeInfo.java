package Lesson8.Prob2.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	public void sort(List<Employee> emps,  SortMethod method) {	
		Collections.sort(emps, (e1,e2) ->
		{
			if(method == SortMethod.BYNAME) {
//				return e1.name.compareTo(e2.name);
				if(e1.name.compareTo(e2.name) != 0) 
					return e1.name.compareTo(e2.name);
				if(e1.salary == e2.salary)
					return 0;
				if(e1.salary > e2.salary)
					return 1;
				else
					return -1;
			} else {
//				if(e1.salary == e2.salary) return 0;
//				else if(e1.salary < e2.salary) return -1;
//				else return 1;
				if(e1.salary != e2.salary) {
					if(e1.salary < e2.salary)
						return -1;
					return 1;
				}
			}
				return e1.name.compareTo(e2.name);
		});			
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Joe", 80000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
