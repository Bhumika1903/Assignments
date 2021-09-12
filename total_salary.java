/*Write a program to calculate the total salary of a person.
The user has to enter the basic salary (an integer) and the
grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
    
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.


Round off the total salary and then print the integral part only.

Note: Try finding out a function on the internet to do so

Input format :
Basic salary & Grade (separated by space)

Output Format :
Total Salary

Constraints :
0 <= Basic Salary <= 7,500,000*/



package assignment_que;
import java.util.Scanner;
import java.lang.Math;

public class total_salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        long basic = sc.nextLong();
        char Grade = sc.next().charAt(0);

        double TotalSalary = 0;
        double allow = 0;
        double pf = 0.11*basic;
        double hra = 0.20*basic;
        double da = 0.50*basic;

        if(Grade =='A'){
            allow = 1700;
        }else if(Grade == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }

        TotalSalary=basic+hra+da+allow-pf;

        System.out.println(Math.round(TotalSalary));


		

}
}