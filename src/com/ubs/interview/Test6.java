package com.ubs.interview;

public class Test6 {
public static void main(String[] args) {
	String a="JAVA";
	String b="JAVA";
	String c=new String("JAVA");
	
	
	System.out.println(a==b);

	System.out.println(a==c);

	System.out.println(a.equals(c));

	System.out.println(b==c.intern());
}
}
