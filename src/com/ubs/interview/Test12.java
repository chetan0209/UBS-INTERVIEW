package com.ubs.interview;

import java.math.BigDecimal;

public class Test12 {
public static void main(String[] args) {
	Double d1=new Double("2.0");
	Double d2=new Double("2.00");
	
	BigDecimal b1=new BigDecimal("2.0");

	BigDecimal b2=new BigDecimal("2.00");
	
	System.out.println(d1.equals(d2)+": "+b1.equals(b2));
}
}
