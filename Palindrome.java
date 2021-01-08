
import java.util.HashSet;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWelcomEemoclewHelloolle";
		String finalPalindrome= "";
		System.out.println(isPalindrome(str));
		
		Set<String> palindromes = new HashSet<String>();
		
	    for (int i = 0; i < str.length(); i++) {
	        for (int j = i + 2; j <= str.length(); j++) {
	            if (isPalindrome(str.substring(i, j))) {
	            	if(finalPalindrome.length() <  str.substring(i,j).length())
	            		finalPalindrome = str.substring(i,j);
	                palindromes.add(str.substring(i, j));
	            }
	        }
	    }
	    System.out.println(palindromes);
	    System.out.println(finalPalindrome);

	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder mainStr = new StringBuilder(str.toLowerCase());
		StringBuilder reverse = mainStr.reverse();
		return (reverse.toString()).equals(str.toLowerCase());
	}

}
