package com.upgraded.StudentReportCard;

public class ScienceStudent extends StudentInfo1{
	public String subject1;
	public String subject2;
	public String subject3;
	
	

	public ScienceStudent(String sname, String rollNo, double marks1, double marks2, double marks3) {
		super(sname, rollNo, marks1, marks2, marks3);
		this.subject1 = "Java";
		this.subject2 = "OS";
		this.subject3 = "DBMS";
	}



	@Override
	public void setGrade() {
		if(Average >= 90.00 && Average<=100.00) {
			this.grade="A";
		}
		else if(Average >= 75.00 && Average<=89.00) {
			this.grade="B";
		}
		else if(Average >=60.00  && Average<=74.00) {
			this.grade="C";
		}
		else if(Average >=45.00 && Average<=59.00) {
			this.grade="D";
		}
		else if(Average<45.00) {
			this.grade="Fail";
		}
		else {
			this.grade="Invalid";
		}
	}



	@Override
	public String toString() {
		return "ScienceStudent [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", sname="
				+ sname + ", rollNo=" + rollNo + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3
				+ ", Total=" + Total + ", Average=" + Average + ", grade=" + grade + "]";
	}
	
	
	/*
	 * public static void main(String args[]) {
		ScienceStudent scstu = new ScienceStudent("Nandini", "k5", 90.00, 91.00, 93.00);
		System.out.println(scstu.toString());
		
	}
	 */
}
