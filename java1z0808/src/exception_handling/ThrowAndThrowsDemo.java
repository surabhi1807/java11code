package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowAndThrowsDemo {
public void  createfileobject() throws ArithmeticException, IOException {
	System.out.println(5/0);
	File file=new File("C:\\Users\\ADMIN\\OneDrive\\Documents\\New folder\\Hello.txt");
   file.createNewFile();
	throw new FileNotFoundException();
}
public void m1() throws IOException {
	throw new FileNotFoundException();
}
public void m2 () throws NullPointerException {
	
	throw new RuntimeException();
}
public void m3 () throws RuntimeException {
	
	throw new NullPointerException();
}
	public static void main(String[] args) throws ArithmeticException, IOException {
    ThrowAndThrowsDemo t=new ThrowAndThrowsDemo();
    t.createfileobject();
	}

}
