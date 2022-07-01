import java.util.Scanner;

/*Given a string S (that can contain multiple words), you need to find the word which has minimum length.

Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.

Input Format :
String S

Output Format :
Minimum length word

Constraints :
1 <= Length of String S <= 10^5

Sample Input 1 :
this is test string

Sample Output 1 :
is

Sample Input 2 :
abc de ghihjk a uvw h j

Sample Output 2 :
a*/

public class Minimum_length_word {
	
	public static String minLengthWord(String input) {
		int start = -1;
		int length = Integer.MAX_VALUE;
		int curr_start = 0;
		int i = 0;
		for (;i<input.length();i++) {
			if (input.charAt(i) == ' ') {
				int curr_wordlength = i - curr_start;
				if (curr_wordlength < length) {
					start = curr_start;
					length = curr_wordlength;
				}
				curr_start = i+1;
			}
		}
		if (start == -1) {
			return input;
		}else {
			int curr_wordlength = i - curr_start;
			if (curr_wordlength < length) {
				start = curr_start;
				length = curr_wordlength;
			}
			
		}
		return input.substring(start , start+length);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));

	}

}
