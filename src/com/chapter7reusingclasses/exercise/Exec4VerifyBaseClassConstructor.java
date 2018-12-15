package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月15日 下午11:50:32   
 */
class A {
	A() { System.out.println("A()");}
}

class B extends A { B(){ System.out.println("B()");} }

class C extends B { C(){ System.out.println("C()");} }

class D extends C {
	D() { System.out.println("D()"); }
	public static D makeD() { return new D();}
	public static void main(String[] args) {
		D d = new D();
		D d2 = makeD();
	}
}	
public class Exec4VerifyBaseClassConstructor extends D {
	Exec4VerifyBaseClassConstructor() { System.out.println("E()");}
	public static void main(String[] args) {
		Exec4VerifyBaseClassConstructor e = new Exec4VerifyBaseClassConstructor();
		// test D:
		D.main(args);
	}
}
