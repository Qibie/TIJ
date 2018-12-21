package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.print;

/**
 * @author qibie
 * @date 2018年12月22日 上午12:40:05   
 */
class Component0001 {
	Component0001() {print("Component01()");}
	void dispose() {print("Component01.dispose()");}
}
class Component0002 {
	Component0002() {print("Component02()");}
	void dispose() {print("Component02.dispose()");}
}
class Component0003 {
	Component0003() {print("Component03()");}
	void dispose() {print("Component03.dispose()");}
}

class Root01 {
	Component0001 c1root;
	Component0002 c2root;
	Component0003 c3root;
	Root01() { 
		print("Root01()"); 
		c1root = new Component0001();
		c2root = new Component0002();
		c3root = new Component0003();
	}
	void dispose() {
		c3root.dispose();
		c2root.dispose();
		c1root.dispose();
		print("Root01.dispose()");
	}
}

class Stem01 extends Root01 {
	Component0001 c1stem;
	Component0002 c2stem;
	Component0003 c3stem;
	Stem01() {
//		super();
		print("Stem01()");
		c1stem = new Component0001();
		c2stem = new Component0002();
		c3stem = new Component0003();
	}
	void dispose() {
		c3stem.dispose();
		c2stem.dispose();
		c1stem.dispose();
		super.dispose();
		print("Stem01.dispose()");
	}
}

public class Exec12CleanUp {
	public static void main(String[] args) {
		Stem01 s = new Stem01();
		try {
		} finally {
			s.dispose();
		}
	}
}
