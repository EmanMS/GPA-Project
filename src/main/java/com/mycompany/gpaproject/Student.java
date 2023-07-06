package com.mycompany.gpaproject;

public class Student {
	
	 private static long id;
	 private static double gpa;
	/**
	 * @return the gpa
	 */
	public static void setGpa(double d) {
		Student.gpa = d;
		
	}
	public static double getGpa() {
		return gpa;
	}
	
	/**
	 * @param gpa the gpa to set
	 */
	public static void setid(long i) {
		Student.id = i;
	}
	
	public static  long getid() {
		return id;
	}


	/**
	 * @param gpa the gpa to set
	 */
	
}
