package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午4:46:42   
 */
public class MethodInit3 {
	//! int j = g(i); // Illegal forward reference
	int i = f();
	int f() { return 11; }
	int g(int n) { return n * 10; }
}
