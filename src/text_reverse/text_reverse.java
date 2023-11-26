package text_reverse;

import java.util.Scanner;

public class text_reverse {

	public static void main(String[] args) {
		
		System.out.println("Please enter the text want to reverse");
		Scanner input = new Scanner(System.in);
		String text = input.next();
		
		for (int i = text.length()-1; i>0 ; i--) {
			
			/*Kala --> 4-3-2-1-0
			  0123
			  alak
			  */
			System.out.print(text.charAt(i));
		}
			input.close();
	}

}
