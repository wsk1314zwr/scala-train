package com.wsk.bigdata.java.JavaTest;

import java.util.ArrayList;
import java.util.List;

public class ArraryTest {

	public ArraryTest() {

		List<String> stringArray = new ArrayList<>();
		stringArray.add("abc");
		stringArray.add("def");
		change(stringArray);
		System.out.println(stringArray.get(1));

	}
	public void change(List<String>  stringArray){
		stringArray.set(1,"123");
	}

	public static void main(String[] args) {
		new ArraryTest();
	}

}
