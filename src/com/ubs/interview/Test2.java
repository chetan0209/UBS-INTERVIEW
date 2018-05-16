package com.ubs.interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
	List<String> l=Arrays.asList(new String[] {"A","B","C","D"});
	
	Iterator<String> it=l.iterator();
	
	while(it.hasNext()) {
		String str=it.next();
		if(str.equals("B")) {
			l.remove(str);
		}
	}
	System.out.println(l);
}
}
