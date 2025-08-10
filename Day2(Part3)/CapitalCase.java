/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.*/
import java.util.Scanner;
class CapitalCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		boolean result = isCapital(str);
		System.out.println(result);
		sc.close();
	}
	public static boolean isCapital(String str)
	{
		int count = 0;
		int len =str.length();
		char[] ch = str.toCharArray();
		for(char c : ch)
		{
			if('Z' - c >= 0) count++;
			
		}
		if(count == 0 || count==len|| count==1 && 'Z'-ch[0] >=0)
		{
			return true;
		}
		return false;

	}
}