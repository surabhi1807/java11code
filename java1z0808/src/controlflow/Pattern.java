package controlflow;

public class Pattern {
	
	public static void printTriangle1() {
		int rc= 4;
		int sc =1;
	for(int i=0; i<rc; i++)
	{
		for(int j=0; j<sc; j++)
		{
			System.out.print(" *");
	}
	System.out.println();
	sc++;
     
}	
	}
	
	public static void main(String[] args) {
	//	printTriangle1();
	PrintTriangle2();
  
}
	public static void PrintTriangle2() {
		int rc= 4;
		int sc =4;
		int bc= 0;
	for(int i=0; i<rc; i++)
	{
		for(int j=0; j<bc; j++) 
		{
			System.out.print(" ");
		}
		bc++;
		for(int k=0; k<sc; k++)
		{
			System.out.print("*");
		}
		sc--;
		System.out.println();
}
  
}


	}
