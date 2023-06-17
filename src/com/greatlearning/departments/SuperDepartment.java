package com.greatlearning.departments;

import com.greatlearning.interfaces.Department;

public class SuperDepartment implements Department {
	
	@Override
	public String departmentName() {
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		return "No Work as of now";
		
	}
	
	@Override
	public String getWorkDeadline() {
		return "Nil";
	}
	
	public String  isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}
