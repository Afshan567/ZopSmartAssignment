package practice;

import org.testng.annotations.Test;

public class strProgrm {
@Test
public void str() {
	String s1=new String("java");
	String s2=new String("java");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	String s3="abc";
	String s4="abc";
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	String s5="az";
	String s6="aq";
	System.out.println(s5==s6);
	System.out.println(s5.equals(s6));
}
@Test
public void prgm() {
	System.out.println('a');
	System.out.println("a");
	System.out.println('a'+'c');
	System.out.println(2);
	System.out.println(5+2);
	System.out.println('3');
	System.out.println('4'+'2');
}
}