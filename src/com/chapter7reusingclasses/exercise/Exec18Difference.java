package com.chapter7reusingclasses.exercise;

import java.util.*;

/**
 * @author qibie
 * @date 2019年1月22日 下午11:47:38
 */
class Test {
	Test() {
		System.out.println("Test()");
	}
}

class Difference {
	private String name;

	public Difference(String s) {
		name = s;
	}

	static final Test sft = new Test(); // constant reference address
	private final Test ft = new Test();
	static final String SFS = "static final"; // class constant
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt(); // class constant
	private final int fi = rand.nextInt();

	public String toString() {
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
	}
}

public class Exec18Difference {

	public static void main(String[] args) {
		Difference d1 = new Difference("d1");
		Difference d2 = new Difference("d2");
		Difference d3 = new Difference("d3");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
