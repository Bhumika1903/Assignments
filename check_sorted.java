import java.util.Scanner;

public class check_sorted {
	public static boolean checksortedbetter2(int input[]) {
		return checksortedbetter(input, 0);
		
	}
	
	private static boolean checksortedbetter(int input[] , int startindex) {
		if (startindex >= input.length-1) {
			return true;
		}
		if (input[startindex] > input[startindex + 1]) {
			return false;
		}
		boolean ans = checksortedbetter(input , startindex + 1);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input[] = {1,2,3,4,5,6};
		System.out.println(checksortedbetter2(input));
		
		
		

	}

}
