package hw6;
import java.util.Scanner;
public class TextAnalyzer 
{
	public static int countVowels(String str) 
	{
		int count = 0;
		for (int i=0 ; i < str.length(); i++)
		{
	         char chars = str.charAt(i);
	         if(chars == 'a'|| chars == 'e'|| chars == 'i' 
	        		 ||chars == 'o' ||chars == 'u')
	         {
	            count ++;
	         }
		}
		 System.out.println("Total vowels: " + count);
		 return count;
	}
	public static int countWords(String userInput)
	{  
	    if(userInput == null)
	    {
	    	return 0;
	    }
	    String[] words = userInput.split("\\s+");
	    return words.length;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter a sentence: ");
	    Scanner sc = new Scanner(System.in);
	    String inp = sc.nextLine();
		countVowels(inp);
	    System.out.printf("Total Words: %d", countWords(inp));
	}
}
