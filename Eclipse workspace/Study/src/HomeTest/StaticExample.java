
public class StaticExample {


	public static void main(String[] args)
 {
		System.out.println("main");
		StaticExample.add ();
		StaticExample S = new StaticExample();
		S.sub();
	}
	
public static void add (){
	System.out.println("im add");
}

public void sub(){
	System.out.println("sub");
}
	
	public StaticExample() {
System.out.println("construct");
	}

}
