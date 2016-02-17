import java.util.Scanner;


public class AllPrimefactorsofanumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner m = new Scanner(System.in);
		System.out.println("please enter a number");
		System.out.println();
	 long numberEntered = m.nextLong();
          Primefactor(numberEntered);
          allfactor(numberEntered);
	}
	
	public static void Primefactor(long b){
		long x =0;
		
		checkprime(b);	
		
		for(x=1;x<b;x++){
			if (b%x==0){
				prime(x);
			}
			
			}
		
		
	}
	
	   public static void prime(long a)
	   { long p = a;
		 long i=0;
	     long count= 0;
	      
	     for (i=1;i<=p; i++){
	    	 if (p%i==0){
	    		count = count+1; 
	    	 }
	    	 }
	     if (count==2){
	    	
	    	 System.out.println("prime factor " + p + " ");
	     }
	
		 	         
	   }
		public static void allfactor(long b){
			long x =0;
			String y =" ";
				
			for(x=1;x<=b;x++){
				if (b%x==0){
					y = y + x +" ";	
				}
				
				}
			System.out.println("All factors of "+y+" ");
			
			
		}
		public static void checkprime(long a)
		   { long p = a;
			 long i=0;
		     long count= 0;
		      
		     for (i=1;i<=p; i++){
		    	 if (p%i==0){
		    		count = count+1; 
		    	 }
		    	 }
		     if (count==2){
		    	
		    	 System.out.println("you have entered a prime number");
		     }
		
		
			 	         
		   }
	   }

