package com.util;

import org.testng.annotations.Test;

import javafx.beans.binding.StringBinding;

public class ReverseString {
	String name = "Gaurav";
	@Test
	public void a() {
//		StringBuffer sb = new StringBuffer();
//		sb.append("Kumar");
//		System.out.println(sb.append(name));
		StringBuilder ss = new StringBuilder();
		ss.append("soni");
		ss.append(2);
		ss.append("pankaj");
		//ss.reverse();
		ss.deleteCharAt(4);
		System.out.println(ss);
	}
}
