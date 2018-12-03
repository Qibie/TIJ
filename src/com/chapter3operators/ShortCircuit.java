package com.chapter3operators;

import static net.mindview.util.Print.*;

/**
 * Demonstrates short-circuiting behavior with logical operators.
 * 
 * @author qibie
 * @date 2018年12月3日 下午6:00:11
 */
public class ShortCircuit {
	static boolean test1(int val) {
		print("test1(" + val + ")");
		print("result: " + (val < 1));
		return val < 1;
	}

	static boolean test2(int val) {
		print("test2(" + val + ")");
		print("result: " + (val < 2));
		return val < 2;
	}

	static boolean test3(int val) {
		print("test3(" + val + ")");
		print("result: " + (val < 3));
		return val < 3;
	}

	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);
		print("expression is " + b);
	}
}