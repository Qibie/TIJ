package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2019年1月23日 上午12:09:07   
 */
class A01 {
	static int j = printInit("A.j initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 1;
	}
	A01() { System.out.println("A() constructor"); }	
} 

class B01 extends A01 {
	static int k = printInit("B.k initialized");
	B01() { System.out.println("B() constructor"); }	
}
	
class C01 {
	static int n = printInitC("C.n initialized");
	static A01 a = new A01();	
	C01() { System.out.println("C() constructor"); }
	static int printInitC(String s) {
		System.out.println(s);
		return 1;
	}
}

class D01 {
	D01() { System.out.println("D() constructor"); }
}

class LoadClass extends B01 {
	static int i = printInit("LoadClass.i initialized");
	LoadClass() { System.out.println("LoadClass() constructor"); }
}

public class Exec23LoadClass {
	public static void main(String[] args) {
		// accessing static main causes loading (and initialization)
		// of A, B, & LoadClass
		System.out.println("hi");
		// call constructors from loaded classes:
		LoadClass lc = new LoadClass();
		// call to static field loads & initializes C:
		System.out.println(C01.a);
		// call to constructor loads D:
		D d = new D();
	}
}
 