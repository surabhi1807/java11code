package controlflow;
import java.util.*;
public class Multiple {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		n = sc.nextInt();
				if(n%2==0 && n%3==0)
				{
					System.out.println("Multiple of both 2 and 3");
				}
				else if(n%3==0)
		{
			System.out.println("Multiple of 3 only");
		}
		else if(n%2==0)
		{
			System.out.println("Multiple of 2 only");
		}
		else {
			System.out.println("Neither multiple of 2 nor 3 ");
		}
	}

}
