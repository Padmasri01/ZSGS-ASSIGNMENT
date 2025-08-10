/*6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself*/

import java.util.Scanner;

class AddString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter number 2: ");
		String str2 = sc.nextLine();
		String result = addString(str1, str2);
		System.out.println(result);
		sc.close();
	}
	public static String addString(String str1, String str2)
	{
		int len1 = str1.length()-1;
		int len2 = str2.length()-1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while(len1 >=0 || len2>=0)
		{
			int digit1 = len1>=0 ? str1.charAt(len1) - '0': 0;
			int digit2 = len2>=0 ? str2.charAt(len2) - '0': 0;
			int sum = digit1 + digit2+ carry;
			carry = sum/10;
			sb.append(sum%10);
			len1--;
            len2--;


		}
		return sb.reverse().toString();		
	}
}
