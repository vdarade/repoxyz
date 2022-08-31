package program;

public class Demo1 {

	public static void main(String[] args) {
 
	//	program to seperates alphabed,digit,special char
		
		String str="impratiksha07-05-1989%";
		String digit="",alphabet="",specialChar="";
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
			digit=digit+str.charAt(i);
			
			}
			else if(Character.isAlphabetic(str.charAt(i))) {
				alphabet=alphabet+str.charAt(i);
			}
			else {
				specialChar=specialChar+str.charAt(i);
			}
		}
		System.out.println("digit are  "+digit);
		System.out.println("alphabets are  "+alphabet);
		System.out.println("secial char are "+specialChar);


	}

}
