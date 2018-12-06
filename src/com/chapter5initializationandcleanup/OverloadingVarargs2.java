package com.chapter5initializationandcleanup;

//: initialization/OverloadingVarargs2.java
//{CompileTimeError} (Won’t compile)
/**
 * @author qibie
 * @date 2018年12月6日 下午10:40:52
 */
public class OverloadingVarargs2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(Character... args) {
		System.out.print("second");
	}

	public static void main(String[] args) {
		f(1f, 'a');
//		f('a', 'b');
	}
}
