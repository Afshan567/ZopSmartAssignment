package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ArrayReverse {
@Test
public void arrRev() {
	int[][] a= {{1,2,3},{8,4,9},{31,11,21}};
	
for(int i=a.length-1;i>=0;i--)
{
	int[] k=a[i];
for(int j=0;j<k.length;j++)
{
	for(int l=j+1;l<k.length;l++)
	{
		if(k[j]<k[l])
		{
			int temp=k[j];
			k[j]=k[l];
			k[l]=temp;
		}
		
	}
	System.out.print(k[j]+" ");
}
			
			}
}
@Test
public void duplicateCount() {
	String s="afshan";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch:set)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch.equals(s.charAt(i)))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(ch+" occurs "+count+" times");
		}
	}
}
@Test
public void  arrProduct() {
	int[] a= {2,4,7,9,10};
	int fmax=a[0];
	int smax=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>fmax)
		{
			fmax=a[i];
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>smax && a[i]<fmax)
		{
			smax=a[i];
		}
	}
	System.out.println(fmax+" "+smax);
	System.out.println("Product of 2 longest consective numbers is "+(fmax*smax));
}
@Test
public void listSumAndMul()
{
	ArrayList<Integer> l1 = new ArrayList<Integer>();
	int sum=0;
l1.add(2);
l1.add(4);
l1.add(9);
l1.add(10);
for(Integer i:l1)
{
	sum=sum+i;
}
System.out.println("List1 sum="+sum);
ArrayList<Integer> l2 = new ArrayList<Integer>();
int sum2=0;
l2.add(3);
l2.add(5);
l2.add(9);
l2.add(4);
for(Integer i:l2)
{
	sum2=sum2+i;
}
System.out.println("List2 sum="+sum2);
System.out.println("Product of both the lists="+(sum*sum2));
}
@Test
public void num() {
	String s="Aabb1235dd45ee1ff44";//o/p 44,1,45,1235
	String r="";
	String[] d=new String[s.length()];
	int m=0;
	for(int i=0;i<s.length();i++)//0<19 1 2 3 4 5 6 7 8
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')//A a b b 1 2 3 5 d
		{
			r=r+s.charAt(i);//1235
		}
		else if(!r.equals(""))
		{
		d[m]=r;
		m++;
		r="";
		}	 
	}
	d[m]=r;
	m++;
	for(int i=d.length-1;i>=0;i--)
	{
		if(d[i]!=null && i>0)
			System.out.print(d[i]+",");
		else if(d[i]!=null)
			System.out.println(d[i]);
			}
}
}


