/*7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/


import java.util.Scanner;

class CountSegment
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		int result = countSegment(s);
		System.out.println(result);
		sc.close();
	}
	public static int countSegment(String str)
	{
		int count = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if((i== 0 || str.charAt(i-1)== ' ') && str.charAt(i) != ' ')
			{
				count++;
			}
		}
		return count;

	}	
}