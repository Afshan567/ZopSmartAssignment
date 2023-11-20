package zposmrt;

import org.testng.annotations.Test;

public class abc {
@Test
public void a() {
	String s="()";
	boolean flag=false;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
		if(s.charAt(i)-s.charAt(j)==-1)
		{
			flag=true;
			
		}
		else
		{
			flag=false;
			break;
		}
		}
		break;
	}
		if(flag==true)
		{
			System.out.println(flag);
		}
		else
		{
			System.out.println(flag);
		}
}
@Test
public void b() {
	String s="()[]{}";
	boolean flag=false;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
		if(s.charAt(i)-s.charAt(j)==-1 || s.charAt(i)-s.charAt(j)==-2)
		{
			flag=true;
			break;
		}
		else
		{
			flag=false;
			break;
		}
		
	}
		i++;
	}
	if(flag==true)
	{
		System.out.println(flag);
	}
	else
	{
		System.out.println(flag);
	}
}
@Test
public void c()
{
	String s="(]";
	boolean flag=false;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
		if(s.charAt(i)-s.charAt(j)==-1)
		{
			flag=true;
			
		}
		else
		{
			flag=false;
			break;
		}
		}
		break;
	}
		if(flag==true)
		{
			System.out.println(flag);
		}
		else
		{
			System.out.println(flag);
		}
}
}