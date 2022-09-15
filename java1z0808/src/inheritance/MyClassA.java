package inheritance;

public class MyClassA implements MyInterfaceX,MyInterfaceY {

	@Override
	public void m1() {
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m3(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m4(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
	//	System.out.println(a);
		System.out.println(MyInterfaceX.a);
		System.out.println(MyInterfaceY.a);

	}

}
