package com.astra.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;





public class Client {

	public static void main(String[] args) {
		int empid;
		String empname;
		float salary;
		String company;
		String designation;
		Employee emp;
		HashMap<Integer, Employee> empmap= new HashMap<Integer, Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.println("************EmployeeManagementApp*********");
		while (true) {
			System.out.println("1) Add Employee");
			System.out.println("2) Update Employee");
			System.out.println("3) Delete Employee");
			System.out.println("4) Get empinfo");
			System.out.println("5) Get All empmap");
			System.out.println("6) GetALL empmap In between salary");
			System.out.println("7) GetAll empmap By Company");
			System.out.println("8) GetAll empmap By Designation");
			System.out.println("9) Exit");

			int option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter Employee Info To Save");
				System.out.println("Enter EmployeeId :");
				empid= scan.nextInt();
				System.out.println("Enter EmployeeName :");
				empname= scan.next();
				System.out.println("Enter Employee salary:");
				salary= scan.nextFloat();
				System.out.println("Enter Employee company:");
				company= scan.next();
				System.out.println("Enter Employee designation:");
				designation= scan.next();
				Employee = new Employee(empid, empname, salary, company, designation);
				empmap.put(empid, Employee);
				System.out.println("Employee Saved Successfully");
				break;
			case 2:
				
				System.out.println("Enter Employee Info To Save");
				System.out.println("Enter EmployeeId :");
				empid= scan.nextInt();
				System.out.println("Enter EmployeeName :");
				empname= scan.next();
				System.out.println("Enter Employee salary:");
				salary= scan.nextFloat();
				System.out.println("Enter Employee company:");
				company= scan.next();
				System.out.println("Enter Employee designation:");
				designation= scan.next();
				Employee = new Employee(empid, empname, salary, company, designation);
				empmap.put(empid, Employee);
				System.out.println("Employee Saved Successfully");
				break;
			case 3:
				System.out.println("Enter Exsisting EmployeeId To Delete:");
				EmployeeId = scan.nextInt();
				empmap.remove(EmployeeId);
				System.out.println("Employee Removed Successfully");
				break;
			case 4:
				System.out.println("Enter Exsisting Id To Get Employee Info");
				empid= scan.nextInt();
				Employee empinfo= empmap.get(EmployeeId);
				System.out.println(empinfo);
				break;
			case 5:
				Set<Integer> keys = empmap.keySet();
				Iterator<Integer> itr = keys.iterator();
				while (itr.hasNext()) {
					int key = itr.next();
					System.out.println(empmap.get(key));
				}
				break;
			case 6:
				System.out.println("Enter Employee IntialSalary :");
				float initialsal= scan.nextFloat();
				System.out.println("Enter Employee finalSalary :");
				float finalsal= scan.nextFloat();
				keys = empmap.keySet();
				itr = keys.iterator();
				while (itr.hasNext()) {
					int key = itr.next();
					empinfo= empmap.get(key);
					salary= empinfo.getSalary();
					if (salary> initialsal&& salary < finalsal)
						System.out.println(empinfo);
				}
				break;
			case 7:
				System.out.println("Enter Employee Company :");
				String companyinp= scan.next();
				keys = empmap.keySet();
				itr = keys.iterator();
				while (itr.hasNext()) {
					int key = itr.next();
					empinfo = empmap.get(key);
					company = empinfo.getCompany();
					if (companyinp.equals(company))
						System.out.println(empinfo);
				}
				break;
			case 8:
				System.out.println("Enter Employee Designation:");
				String design = scan.next();
				keys = empmap.keySet();
				itr = keys.iterator();
				while (itr.hasNext()) {
					int key = itr.next();
					empinfo = empmap.get(key);
					designation= empinfo.getEmployeeBrandName();
					if (design.equals(designation))
						System.out.println(empinfo);
				}
				break;
			default:
				System.out.println("Thank You!!!");
				scan.close();
				System.exit(0);
				break;
			}

		}
	}

}
