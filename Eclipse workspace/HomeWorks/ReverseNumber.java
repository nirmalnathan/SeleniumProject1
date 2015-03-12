package HomeWorks;

public class ReverseNumber {


	public static void main(String[] args) {
	int r= args[0].length();	
	int i =Integer.parseInt(args[0]);
	int j ;
	int k=0,m ;
	for (j=1;j<=r;j++){
	m=k*10;
	k = i%10;
	i=i/10;
	k = k+m;
	}
	System.out.println(k);
	}

}
