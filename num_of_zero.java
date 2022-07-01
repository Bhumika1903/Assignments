
public class num_of_zero {
public static int countZerosRec(int input){
	if (input == 0) {
		return 1;
	}
	if(input<10)
	{
		return 0;			
	}
	else if(input%10==0)
	{
		return 1+countZerosRec(input/10);
	}
	return countZerosRec(input/10);

	
	
		
	}


	public static void main(String[] args) {
		int n = 702700;
		int ans = countZerosRec(n);
		System.out.println(ans);
		

	}

}
