package com.ubs.interview;

public class Test4 {
public static void main(String[] args) throws Exception{
	Object o=new Object();
	
	synchronized (Thread.currentThread()) {
		o.wait();
		o.notify();
		
	}
}
}
