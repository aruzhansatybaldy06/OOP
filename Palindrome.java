package Practice1;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(isPalindrome(str)) 
			System.out.println('"' + str + '"' + " is palindrome!");
		else System.out.println('"' + str + '"' + " is NOT palindrome!");
		in.close();
	}
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;

		while(left < right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;


	}



}
