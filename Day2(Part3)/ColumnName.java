/*2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1*/

import java.util.Scanner;

class ColumnName
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the column number: ");
		int colNum = sc.nextInt();
		
		String result = columnName(colNum);
		System.out.println(result);
		
		sc.close();
	}
	public static String columnName(int colnum)
	{
		StringBuilder colname = new StringBuilder();
		while(colnum>0)
		{
			colnum--;
			char ch = (char) ('A' + colnum%26);
			colname.insert(0,ch);
			colnum = colnum/26;
			
		}
		return colname.toString();
	}
}
