/*6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.*/


import java.util.Scanner;
import java.util.Arrays;

class MyString
{
	String str;
	char[] ch;
	MyString()
	{
	}
	MyString(String str)
	{
		this.str =str;
		this.ch = str.toCharArray();
	}
	MyString(MyString obj)
	{
		this.str =obj.str;
		this.ch = str.toCharArray();
		
	}
	
	public int leng()
	{
		int count=0;
		for(char c : ch)
		{
			count++;
		}
		return count;
	}

	
	public char charat(int index)
	{
		return ch[index];	
	}


	public boolean equal(MyString other)
	{
		int len1 = this.leng();
		int len2 = other.leng();
		if(len1 != len2) return false;
		for(int i = 0; i< len1; i++)
		{
			if(this.charat(i) == other.charat(i) )
			{
				return true;
			}
		}
		return false;	
	}


	public String touppercase()
	{
		String result = "";
		for(int i = 0;i<this.leng();i++)
		{
			if(this.charat(i)>='a' && this.charat(i)<='z')
			{
				result += (char) (charat(i) - 32);
			}
			else
			{
				result += charat(i);
			}
		}
		return result;
	}


	public String tolowercase()
	{
		String result = "";
		for(int i = 0;i<this.leng();i++)
		{
			if(this.charat(i)>='A' && this.charat(i)<='Z')
			{
				result += (char) (charat(i) + 32);
			}
			else
			{
				result += charat(i);
			}
		}
		return result;
	}


	public String SubStr(int start, int end)
	{
		String result = "";
		for(int i = start; i<end; i++)
		{
			result += this.charat(i);
		}
		return result;
	}


	public String SubStr(int start)
	{
		String result = "";
		for(int i = start; i<this.leng(); i++)
		{
			result += this.charat(i);
		}
		return result;
	}

	public String Concat(MyString other)
	{
		return this.str + other.str;
	}

	public boolean Contains(MyString sub)
	{
		int len1 = this.leng();
		int len2 = sub.leng();
		
		int size = len1 - len2;
		
		String subori = sub.str;
		for(int i = 0; i<size; i++)
		{
			String strori = this.SubStr(i, len2+i);
			if(subori.equals(strori))
			{
				return true;
			}
		}
		return false;
	}

	public int IndexOf(char cc)
	{
		for(int i = 0; i<this.leng(); i++)
		{
			if(ch[i] == cc) return i;
		}
		return -1;
	}

	public String Replace(char oldchar, char newchar)
	{
		for(int i=0;i<this.leng();i++)
		{
			if(ch[i]==oldchar)
			{
				ch[i] = newchar;
				break;
			}
		}
		String result = "";
		for(char c : ch)
		{
			result += c;
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();

		MyString obj1 = new MyString(str);
		System.out.println(obj1.str);

		MyString obj2 = new MyString("hello");
		/*System.out.println("obj2:" + obj2.str);
		System.out.println("obj2:" + Arrays.toString(obj2.ch));*/

		System.out.println("length: " + obj1.leng());

		System.out.println("CharAt: " + obj1.charat(0));

		System.out.println("Equal: " + obj2.equal(obj1));

		System.out.println("Upper Case: " + obj1.touppercase());

		System.out.println("Lower Case: " + obj1.tolowercase());

		System.out.println("Substring1: " + obj1.SubStr(0,3));

		System.out.println("Substring2: " + obj1.SubStr(0));

		System.out.println("Concat: " + obj1.Concat(obj2));

		System.out.println("Containss: " + obj2.Contains(obj1));

		System.out.println("Containss: " + obj2.Contains(obj1));
		
		System.out.println("Index Of: " + obj1.IndexOf('S'));
		
		System.out.println("Replacee: " + obj1.Replace('S', 'P'));


		

	}
}