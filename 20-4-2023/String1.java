
package Strings;

public class String1 {

	public static void main(java.lang.String[] args) {
		
		String str = "Welcome to Java World";
		System.out.println("String : " + str);
		
		System.out.println();
		
		//1. return character at 5th position
		char pos = str.charAt(4);
		System.out.println("Character at fifth position : " + pos );
		
		System.out.println();
		
		//2. compare str with "Welcome" lexicographically
		
		int comp = str.compareToIgnoreCase("Welcome");
		System.out.println("Lexicographically Compared Strings are   : " + comp);
		
		System.out.println();
		
		//3. concatenate "let us learn"
		String concat1 = str.concat(" Let us learn");
		System.out.println(concat1);
		
		System.out.println();
		
		//4. return position of first occurence of character 'a'
		int pos2 = str.indexOf('a');
	  System.out.println("Position of first occurence of character 'a' is : " + pos2);
	    
	    System.out.println();
		
		//5. Replace all occurences of 'a' character with new 'e' 
	    String newstr = str.replaceAll("a", "e");
	    System.out.println("Replaced string :" + newstr );
	    
	    System.out.println();
	    
	    //6. return string between 4th and 10th position 
	    
	    String substr = str.substring(3, 11);
	    System.out.println("String between 4th and 10th position is : " + substr);
	    
	    System.out.println();
	    
	    //7. lowercase of str
	    String lower = str.toLowerCase();
	    System.out.println("String in lowercase : " + lower);
	    
	    System.out.println();
		

	}

}