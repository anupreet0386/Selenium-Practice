
public class pyramid {
	public static void main(String[] args) {
		int m=9; //no of lines wanted
		int p=m-1; // space loop 
		for (int i=1; i<=m;i++)
		{
			for (int x=p;x>=0;x--)
				System.out.print(" ");
			
			for (int n=i;n>1;n--)
				{
				System.out.print(n);
				}
			
			for (int j=1;j<=i;j++)
			{System.out.print(j);}
				
			p--;
				System.out.println();

			}
		}
	}




