package practice;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q: Write a program to check if a number is a palindrome.
		//A: Provide a code snippet in your preferred language that checks if a number is the same when reversed.

		int org= 152;
		String str = Integer.toString(org);
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome.");
		}
	}

}
