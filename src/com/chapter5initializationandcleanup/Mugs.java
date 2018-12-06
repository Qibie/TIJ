package com.chapter5initializationandcleanup;

import static net.mindview.util.Print.*;

/**
 * Java "Instance Initialization."
 * 
 * @author qibie
 * @date 2018年12月6日 下午5:55:08
 */
class Mug {
	Mug(int marker) {
		print("Mug(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		print("mug1 & mug2 initialized");
	}

	Mugs() {
		print("Mugs()");
	}

	Mugs(int i) {
		print("Mugs(int)");
	}

	public static void main(String[] args) {
		print("Inside main()");
		new Mugs();
		print("new Mugs() completed");
		new Mugs(1);
		print("new Mugs(1) completed");
	}
}
