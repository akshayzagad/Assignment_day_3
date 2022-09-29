package com.bridgelabz;

public class employeeWage {
   static final int Wage_Per_Hour=20;
    static final int Full_Day_Hour=8;
    static final int Part_Time_Wage_Per_Hour=4;
    static final int Is_full_Time=1;
    static final int Is_part_time=2;
    static final  int Wage_of_employee=0;
    static final int Wage_of_employee_Part_Timer=0;
    static final int Working_Days_per_Month=20;
    public static void main(String[] args) {
        int day =1;
        int Total_Wage=0;
        int Daily_wage=0;
        while (day<=Working_Days_per_Month) {
            int employeeAttendance= (int)Math.floor(Math.random()*10)%3;
            switch (employeeAttendance) {
                case Is_full_Time:
                    Daily_wage = Wage_Per_Hour * Full_Day_Hour;
                  System.out.println("employee is present and full time");
//                    System.out.println("Wage_of_employee is " + Wage_of_employee);
                    break;
                case Is_part_time:
                    Daily_wage  = Part_Time_Wage_Per_Hour * Wage_Per_Hour;
                  System.out.println("employee is present and Part time");
//                    System.out.println("Wage_of_employee is " + Wage_of_employee_Part_Timer);
                    break;
                default:
                    System.out.println("employee is absent");
            }
            Total_Wage=Total_Wage+Daily_wage;
//            Total_Wage=Total_Wage+Wage_of_employee_Part_Timer;
            day++;
            System.out.println("Total_Wage_of_Employee " + Daily_wage);
        }
          System.out.println("Total_wage == "+Total_Wage);
    }
}
