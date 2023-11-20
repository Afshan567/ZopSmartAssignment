package zposmrt;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class arrayDuplict {

	public static void main(String[] args) {

int[] a= {1,2,3,1};
boolean flag=true;
/*for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			flag=false;
		}
		}
}
	if(flag==false)
	{
		System.out.println("array  has duplicate elements");
	}
	else
	{
		System.out.println("array does not have duplicate elements");
	}*/


LinkedHashSet<Integer> st = new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	st.add(a[i]);
}

for(Integer arr:st)
{
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(arr==a[i])
		{
			count++;
 		}
	}

	if(count>1)
	{
		System.out.println("array has duplicate elements");
		break;
	}
	else
	{
		System.out.println("array does not have duplicate elements");
		break;
	}

	}	
}
}