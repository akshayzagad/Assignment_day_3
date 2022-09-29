package com.bridgelabz;

public class employeeWage {
    public static void main(String[] args) {
        int employeeAttendance= (int)Math.round(Math.random());
        int Wage_Per_Hour=20;
        int Full_Day_Hour=8;

        if (employeeAttendance==1){
         int   Wage_of_employee=Wage_Per_Hour*Full_Day_Hour;
            System.out.println("employee is present");
            System.out.println("Wage_of_employee is "+Wage_of_employee);
        } else {
            System.out.println("employee is absent");
        }
    }
}
