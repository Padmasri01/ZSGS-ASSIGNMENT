package stringutils;

public class StringOperations 
{
	public String concatenate(String s1, String s2) 
	{
        	return s1 + s2;
    	}

    	public String reverse(String s) 
	{
        	return new StringBuilder(s).reverse().toString();
    	}

    	public int length(String s) 
	{
        	return s.length();
    	}
}
