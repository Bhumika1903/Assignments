// Question :- Given principle(p) , rate(r) , time(t) . Write a program to calculate simple interest and take input from user. 

package lecture1;

import java.util.Scanner;


public class simpleinterestcalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int t = s.nextInt();
		int r = s.nextInt();
		int si = (p*t*r)/100;
		System.out.println(si);
	}

		
				

	}


