package com.ubs.interview;

import java.io.Serializable;

public class Test9 implements Serializable{
	{
		System.out.println("2");
	}
	static {
		
			System.out.println("1");
		
	}
	public Test9() {
		System.out.println("3");
	}
public static void main(String[] args) {
	Test9 t=new Test9();
}
}
