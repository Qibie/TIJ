package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午4:45:25
 */
public class MethodInit2 {

	int i = f();
	int j = g(i);

	int g(int n) {
		return n * 10;
	}

	int f() {
		return 11;
	}

}
