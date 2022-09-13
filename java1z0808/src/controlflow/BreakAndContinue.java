package controlflow;

public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			//1 2  4 5 7 8 10 
		}
		b:
			for(int i=1; i<=5; i++) {
				for(int j =1; j<=3; j++) {
						if(j==2) {
							break b;
						}
						System.out.println("inerloop");
					}
					System.out.println("outerloop");
				}
				System.out.println("Surabhi");
			}
	}
	


