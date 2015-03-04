package HomeWorks;

public class Palindrome {

	public static void main(String args[])
	{
		String Z="";
		int j,k;
		j=args[0].length();
		System.out.println();
		for (k=j-1;k>=0;k--)
		{
			String Y = Character.toString(args[0].charAt(k));
			Z=Z+Y;
		}
		System.out.println(Z);
		System.out.println(args[0]);
		if (args[0].equals(Z))
		{
		System.out.println("Yes it is a palindrome");
		}
	else{
		System.out.println("Sorry it is not a palindrome");
	    }
	}
	}
	