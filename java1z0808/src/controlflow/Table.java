package controlflow;
// 3*1=3
// 3*2=6
// 3*3=9
// 3*4=12
// 3*5=15
// 3*6=18
// 3*7=21
// 3*8=24
// 3*9=27
// 3*10=30
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		int num;
		System.out.print("Enter any number");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		
		for(int i=1; i<=10; i++)
		{
		System.out.println(num+"*"+ i +"="+num*i);
		}
	}

}
