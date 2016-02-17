import java.util.Scanner;


public class CheckforPalidrom {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("please enter a String");
	 String value = input.nextLine();

	 int length = value.length();
	 String x =" ";
	 for(int i=length-1;i>=0; i-- )
	 {
		 x = x + value.charAt(i);
		 
	 }
	 String reverse = x.trim();
	 System.out.println("reverse of the string you entered is");
	 System.out.println(reverse);
	
	 //check for palidrome
	 
	 if(value.equalsIgnoreCase(reverse)){
		 System.out.println("you have entered a palidrome");
	 }else{
		 System.out.println("the string you've entered is not a palidrome");
	 }
	 

	}

}
