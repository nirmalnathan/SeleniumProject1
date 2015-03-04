package HomeTest;

public class Maths implements  Arithmatic  {		
	
	public void  add(int a , int b){
		int c = a+b;
		System.out.println(c);
			}
	
	public void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
		}
	public void multi(int a ,int b){
		int c = a*b;
		System.out.println(c);
	}
	
	public static void main (String args[]){
	Maths m = new Maths();	
		m.add(10,5);
		m.sub(15,5);
		m.multi(2,4);
	}
}
