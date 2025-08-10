/*3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.*/

import java.util.Scanner;
import java.util.Arrays;

class ReverseVowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String result = reverseVowels(str);
		System.out.println(result);
		sc.close();
	}
	public static boolean isVowel(char ch)
	{
        	if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch =='u')
		    {
                return true;
        	}
        	return false;
    }
	public static String reverseVowels(String str)
	{
	        char[] ch = str.toCharArray();
        	int left = 0;
        	int right = ch.length-1;
        	while(left<right)
        	{
            		while(left<right && !isVowel(ch[left]))
			        {
                		left++;
            		}
            		while(left<right && !isVowel(ch[right]))
			        {
                		right--;
            		}
            		if(left<right)
			        {
                		char temp = ch[left];
                		ch[left] = ch[right];
                		ch[right] = temp;
                		left++;
                		right--;
            		}
        	}
        	return new String(ch);
	}
}


