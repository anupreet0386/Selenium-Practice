
public class SplitString {

	public static void main(String[] args) {
	String value = "  my name is Anupreet matharoo. I have comer from india to do my master, from SJSU  ";
	
	value = value.trim();
	value = value.replace(".", " ");
	value = value.replace("  ", " ");
	value = value.replace(",", " ");
	value = value.replace("  ", " ");
	System.out.println(value);
	
	int count =0;
	char[] match = {'a','i','o','u','e','A','I','O','U','E'};
	for(int i=0;i<value.length();i++){
		for(int j=0;j<match.length;j++)
		if (value.charAt(i)==match[j]){
			count += 1;
		}
	}
	System.out.println("no. of vowels in the string-->"+count);
	
	String[] arr = value.split(" ");
	System.out.println("no of words in the given string-->"+arr.length);
	}

}
