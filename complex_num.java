/*A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
Implement the Complex numbers class that contains following functions -

1. constructor
You need to create the appropriate constructor.

2. plus -
This function adds two given complex numbers and updates the first complex number.
e.g.

if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1

3. multiply -
This function multiplies two given complex numbers and updates the first complex number.
e.g.

if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2

4. print -
This function prints the given complex number in the following format :
a + ib

Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.

Input Format :
Line 1 : Two integers - real and imaginary part of 1st complex number
Line 2 : Two integers - real and imaginary part of 2nd complex number
Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called)

Output format :
Check details of 'print' function given above.

Sample Input 1 :
4 5
6 7
1

Sample Output 1 :
10 + i12

Sample Input 2 :
4 5
6 7
2

Sample Output 2 :
-11 + i58
*/
package classes_and_object;

public class complex_num {
	private int real;
	private int imaginary;
	
	public  complex_num(int real , int imaginary){
		this.real = real;
		this.imaginary = imaginary;
		
	}
	public int getreal() {
		return real;
	}
	public int getimaginary() {
		return imaginary;
	}
	public void setreal(int r) {
		this.real = r;
	}
	public void setimaginary(int i) {
		this.imaginary = i;
	}
	public void print() {
		if (imaginary<0) {
			System.out.println(real + " " + " +" + -1*imaginary + "i");
		}
		System.out.println(real + " " + "+"+ " " + imaginary + "i");
	}
	public void add(complex_num c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	public void multiply(complex_num c2) {
		int temp = this.real;
		 this.real=this.real * c2.real - this.imaginary * c2.imaginary;
	     this.imaginary= temp * c2.imaginary + this.imaginary * c2.real;
	}
	
	public static complex_num add(complex_num c1,complex_num c3) {
		int newreal = c1.real + c3.real;
		int newimaginary = c1.imaginary + c3.imaginary;
		complex_num c = new complex_num(newreal,newimaginary);
		return c;
	}
}
