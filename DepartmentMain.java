package com.gl.Graded1Oops.main;
import com.gl.Graded1Oops.department.*;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Calling class HrDeapartment and its methods
		 
		HrDepartment Hd = new HrDepartment();
		
		 System.out.println(Hd.departmentName());
		 System.out.println(Hd.getTodaysWork());
		 System.out.println(Hd.getWorkDeadline());
		 System.out.println(Hd.doActivity());
		 System.out.println(Hd.isTodayAHoliday()+"\n");
		 
		// Calling class TechDeapartment and its methods
		
		 TechDepartment Td = new TechDepartment();
		
		 System.out.println(Td.departmentName());
		 System.out.println(Td.getTodaysWork());
		 System.out.println(Td.getWorkDeadline());
		 System.out.println(Td.getTechStackInformation());
		 System.out.println(Td.isTodayAHoliday()+"\n");
		
		// Calling class AdminDeapartment and its methods
		 
		 AdminDepartment Ad = new AdminDepartment();
		
		 System.out.println(Ad.departmentName());
		 System.out.println(Ad.getTodaysWork());
		 System.out.println(Ad.getWorkDeadline());
		 System.out.println(Ad.isTodayAHoliday());

	}

}
