package polymorphism;

public class TestTypeCast {

	public static void main(String[] args) {
  ParentP1 p = new ParentP1();
  ParentP1 c= new ChildC1();
  ChildC1 g=new GrandChildGC1();
 ParentP1 parent1 = (ChildC1)g;
 
 Object o = new String("Surabhi");
 StringBuffer sb=(StringBuffer)o ;
	}

}
