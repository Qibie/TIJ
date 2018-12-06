package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午10:43:10
 */
public class OverloadingVarargs3 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(char c, Character... args) {
		System.out.println("second");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
}
