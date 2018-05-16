package com.ubs.interview;

public class MyThread extends Thread {
 public void run() {
	 System.out.println("a");
 }
 public static void main(String[] args) throws InterruptedException{
	MyThread my=new MyThread();
	my.run();
	my.start();
}
}
