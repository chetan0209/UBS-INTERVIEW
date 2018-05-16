package com.ubs.interview;

public class Test11 {
Test10 doBar() {
	Test10 t=new Test10();
	return t;
}
public static void main(String[] args) {
	Test11 t=new Test11();
	Test10 t1=t.doBar();
	
	System.out.println("newBar");
	t1=new Test10();
	System.out.println("Finished");
}
}
