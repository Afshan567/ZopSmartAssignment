package zposmrt;

import java.util.LinkedHashSet;

public class revStr {

	public static void main(String[] args) {
		String str="Hi my name is Charan";
		String rev="";

		for(int i=str.length()-1;i>=0;i--)
		{
rev=rev+str.charAt(i);		
	}
		System.out.println(rev);

		char[] str2 = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str2[i]);
		}
		
		for(Character c:set)
		{
			int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(c.equals(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(c+" occurs"+count+" times");
		}
 		}
}
