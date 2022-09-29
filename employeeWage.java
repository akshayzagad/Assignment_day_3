package com.bridgelabz;

public class employeeWage {
    public static void main(String[] args) {
        int employeeAttendance= (int)Math.round(Math.random());
        if (employeeAttendance==1){
            System.out.println("employee is present");
        } else {
            System.out.println("employee is absent");
        }
    }
}
