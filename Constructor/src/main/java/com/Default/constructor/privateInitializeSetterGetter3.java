package com.Default.constructor;
class empInfo{
	private String empName;
	private int empId;
	private int empAge;
	private String empLocation;
	
	public empInfo(String empName,int empId,int empAge,String empLocation) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empLocation = empLocation;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public empInfo() {
		empName = "Lakshmi";
		empId = 2;
		empLocation = "Amaravti";
		empAge = 43;
	}
}

public class privateInitializeSetterGetter3 {
	public static void main(String args[]) {
		empInfo e1 = new empInfo();
		e1.setEmpAge(24);
		e1.setEmpId(1);
		e1.setEmpLocation("Bangalore");
		e1.setEmpName("Upendra");
		System.out.println("Employee e1 Age: " + e1.getEmpAge() +"\nemployee e1 Name: "+ e1.getEmpName() +"\nemployee e1 Id: "+e1.getEmpId()+"\nemployee e1 Location: "+e1.getEmpLocation());
		
		empInfo e2 = new empInfo();
		System.out.println("Employee e2 Age: " + e2.getEmpAge() +"\nemployee e2 Name: "+ e2.getEmpName() +"\nemployee e2 Id: "+e2.getEmpId()+"\nemployee e2 Location: "+e2.getEmpLocation());
		
		
		
	}
}
