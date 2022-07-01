package strings;

public class print_prefix {
	public static void printprefix(String str) {
		for (int i = 0;i<str.length();i++) {
			System.out.println(str.substring(2, str.length()));
		}
	}

	public static void main(String[] args) {
		String str = "bhumika";
		printprefix(str);

	}

}
