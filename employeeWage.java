package com.bridgelabz;

public class employeeWage {
   static final int Wage_Per_Hour=20;
    static final int Full_Day_Hour=8;
    static final int Part_Time_Wage_Per_Hour=4;
    static final int Is_full_Time=1;
    static final int Is_part_time=2;
    static final  int Wage_of_employee=0;
    static final int Wage_of_employee_Part_Timer=0;
    public static void main(String[] args) {
        int employeeAttendance= (int)Math.floor(Math.random()*10)%3;
        switch (employeeAttendance){
            case Is_full_Time:
                int   Wage_of_employee=Wage_Per_Hour*Full_Day_Hour;
                System.out.println("employee is present and full time");
            System.out.println("Wage_of_employee is "+Wage_of_employee);
            break;
            case Is_part_time  :
                int Wage_of_employee_Part_Timer=Part_Time_Wage_Per_Hour*Wage_Per_Hour;
           System.out.println("employee is present and Part time");
          System.out.println("Wage_of_employee is "+Wage_of_employee_Part_Timer);
            default:
                System.out.println("employee is absent");
        }
    }
}
