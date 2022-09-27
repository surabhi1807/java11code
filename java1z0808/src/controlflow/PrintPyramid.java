package controlflow;

public class PrintPyramid {
	public static void main(String[] args) {

    int rc=5;
	int bs=3;
	int sc=1;
	for(int i=0;i<rc;i++) {
		for(int j=0;j<bs;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<sc; k++) {
			System.out.print("*");
		}
		System.out.println();
		bs--;
		//sc=sc+2;
		sc=sc+2;
		
	}
	int rc1=4;
	int bs1=2;
	int sc1=4;
	for(int i=0; i<rc1; i++) {
		for(int j=0;j<bs1;j++) {
			System.out.print(" ");
		}
		for(int k=0; k<sc1; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	

	}
}