package com.astra.model;

public class Employee {
	private int empid;
	private String empname;
	private float salary;
	private String company;
	private String designation;

	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid = empid;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public float getsalary() {
		return salary;
	}

	public void setsalary(float salary) {
		this.salary = salary;
	}

	public String getcompany() {
		return company;
	}

	public void setcompany(String company) {
		this.company = company;
	}

	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int empid, String empname, float salary, String company,
			String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.company = company;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary
				+ ", company=" + company + ", designation=" + designation + "]";
	}

}
