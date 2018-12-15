package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月16日 上午12:36:47   
 */
class Component01 {
	Component01(byte b) {
		print("Component01(byte)");
	}
}
class Component02 {
	Component02(short s) {
		print("Component02(short)");
	}
}
class Component03 {
	Component03(int i) {
		print("Component03(int)");
	}
}

class Root1 {
	Component01 c1root;
	Component02 c2root;
	Component03 c3root;
	Root1(float f) {
		c1root = new Component01((byte) 0);
		c2root = new Component02((short) 0);
		c3root = new Component03(0);
		print("Root(float)");
	}
}

class Stem10 extends Root1 {
	Component01 c1stem10;
	Component02 c2stem10;
	Component03 c3stem10;
	Stem10(double d) {
		super(2.78f);
		c1stem10 = new Component01((byte)1);
		c2stem10 = new Component02((short)1);
		c3stem10 = new Component03(1);
		print("Stem10(double)"); 
	}
	
}
public class Exec10Stem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stem10(2.78);
	}

}
