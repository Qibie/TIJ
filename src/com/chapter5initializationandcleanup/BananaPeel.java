package com.chapter5initializationandcleanup;

//: initialization/BananaPeel.java
class Banana {
	void peel(int i) {
		/* ... */ }
}

/**
 * @author qibie
 * @date 2018年12月5日 下午5:42:38   
 */
public class BananaPeel {
	public static void main(String[] args) {
		Banana a = new Banana(), b = new Banana();
		a.peel(1);
		b.peel(2);
	}
}
