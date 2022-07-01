import java.util.Scanner;

/*Check whether a given String S is a palindrome using recursion. Return true or false.

Input Format :
String S

Output Format :	
'true' or 'false'

Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.

Sample Input 1 :
racecar

Sample Output 1:
true

Sample Input 2 :
ninja

Sample Output 2:
false*/

public class Check_Palindrome {
	
	public static boolean isStringPalindrome(String input) {
		int n = input.length();
 
    
        if (n == 0)
            return true;
 
        return isPalRec(input, 0, n - 1);

	}
    static boolean isPalRec(String str,
                            int s, int e)
    {
        
        if (s == e){
            return true;
        }
        
        if ((str.charAt(s)) != (str.charAt(e))){
            return false;
        }
        
        if (s < e + 1){
            return isPalRec(str, s + 1, e - 1);
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));

	}

}
