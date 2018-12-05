package com.chapter5initializationandcleanup;

class Bird2 {
	Bird2(int i) {
	}

	Bird2(double d) {
	}
}

/**
 * @author qibie
 * @date 2018年12月5日 下午4:44:47   
 */
public class NoSynthesis {
	public static void main(String[] args) {
//! Bird2 b = new Bird2(); // No default
		Bird2 b2 = new Bird2(1);
		Bird2 b3 = new Bird2(1.0);
	}
}