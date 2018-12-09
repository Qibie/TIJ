package com.chapter6accesscontrol;

import java.io.PrintStream;

/**
 * @author qibie
 * @date 2018年12月9日 下午6:01:09   
 */
public class Print {
	// Print with a newline:
	public static void print(Object obj) {
		System.out.println(obj);
	}
	// Print a newline by itself
	public static void print() {
		System.out.println();
	}
	// Print with no line break:
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	// The new Java SE5 printf() (from C)
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
