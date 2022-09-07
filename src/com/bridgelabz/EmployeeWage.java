/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
import java.util.Random; 
/**
 * 
 *
 */
public class EmployeeWage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
	      
		Random random= new Random();
		int attendance=random.nextInt(3);
		int WagePerHour=20;
		int FullDay=8;
		int DailyWage=0;
		int PartTime=4;
		
		if(attendance == 1) {
			System.out.println("Employee Present..");
			DailyWage=WagePerHour*FullDay;
			System.out.println("Daily Employee Wage is "+" "+DailyWage);
		}	else if (attendance == 2) {
			System.out.println("Employee Present..");
			DailyWage=WagePerHour*PartTime;
			System.out.println("Parttime Employee Wage is "+" "+DailyWage);
			
		}else
			System.out.println("Employee Absent..");
		
	}

}

