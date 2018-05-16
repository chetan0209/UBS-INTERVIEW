package com.ubs.interview;

import java.text.NumberFormat;

public class Test1 {
public static void main(String[] args) {
	String s="123.23456abcd";
	NumberFormat numberFormat=NumberFormat.getInstance();
	numberFormat.setMaximumFractionDigits(2);
	System.out.println(numberFormat.parse(s));
}
}
