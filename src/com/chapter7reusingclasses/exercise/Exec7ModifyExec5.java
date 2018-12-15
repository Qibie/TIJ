package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月16日 上午12:20:48
 */
class A2 {
	A2(char c, int i) {
		System.out.println("A(char, int)");
	}
}

class B2 extends A2 {
	B2(String s, float f) {
		super(' ', 0);
		System.out.println("B(String, float)");
	}
}

class C7 extends A2 {
	private char c;
	private int i;

	C7(char a, int j) {
		super(a, j);
		c = a;
		i = j;
	}

	// will then construct another A and then a B
	B2 b = new B2("hi", 1f);
}

public class Exec7ModifyExec5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// will construct an A first
		new C7('b', 2);
	}

}
