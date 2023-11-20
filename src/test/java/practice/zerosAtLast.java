package practice;

import org.testng.annotations.Test;

public class zerosAtLast {
@Test
public void LastZero() {
int[] a= {5,0,3,8,4,0,0};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==0)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.print(a[i]+" ");
}
}
}
