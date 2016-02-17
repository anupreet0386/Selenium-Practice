package module2;
import java.util.Scanner;
public class userinputforsumofnumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner p=new Scanner(System.in);
		//Scanner x=new Scanner(System.in);
		
	System.out.println("what is your name");
	@SuppressWarnings("unused")
	String name= p.next();
	System.out.println("how many first numbers you want to add?");
	long n= p.nextLong();
	//long n= x.nextLong()
	int sum=0, i;
	for(i=1;i<=n;i++)
	{ sum= sum+i;
	}
	System.out.println("sum of numbers= "+sum);
	}

}
