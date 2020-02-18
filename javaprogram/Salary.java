package com.cognizant.training;

 class EmployeeDetails {
	
	
		private int employeeId;
		private String employeeName;
		private String designation;
		private String address;
		private long phoneNumber;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
	
}

class Salary extends EmployeeDetails
{
	 double basicPay=5000;
	 double da;
	 double hra;
	 double grossPay;
	 double pf;
	 double incomeTax;
	 double  netPay;
	 double calculate()
	 {
       da= 0.30*basicPay;
       hra=12.5 * basicPay;
       pf=0.12 * basicPay;
       grossPay=basicPay + da + hra;
       netPay= grossPay - pf;
       return netPay;
	 }
	 public static void main(String []args)
		{
			EmployeeDetails ed=new EmployeeDetails();
			ed.setEmployeeId(12);
			ed.setEmployeeName("Pulkit");
			ed.setAddress("Indore");
			ed.setDesignation("Coder");
			ed.setPhoneNumber(982721167);
			System.out.println(ed.getEmployeeId());
			System.out.println(ed.getEmployeeName());
			System.out.println(ed.getDesignation());
			System.out.println(ed.getPhoneNumber());
			System.out.println(ed.getAddress());
			Salary sd=new Salary();
			sd.calculate();
			System.out.println("GrossPAy = " + " "+sd.grossPay);
			System.out.println("Net Pay"+ " " +sd.netPay);
			
			
		}
}
