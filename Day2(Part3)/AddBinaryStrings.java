/*1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

import java.util.Scanner;
class AddBinaryStrings
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String a = sc.nextLine();
		System.out.println("Enter string 2: ");
		String b = sc.nextLine();
		String result = addBinary(a, b);
		System.out.println(result);
		
		sc.close();
	}
	public static String addBinary(String a, String b)
	{
		StringBuilder sb = new StringBuilder();
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		
		while(i>=0 || j>=0)
		{
			int sum = carry;
			if (i >= 0)
			{
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0)
			{
                sum += b.charAt(j) - '0';
                j--;
            }
			sb.append(sum % 2);
            carry = sum / 2;
		}
		if(carry != 0) sb.append(carry);
		return sb.reverse().toString();
	}
}