package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月15日 下午11:58:39   
 */
class A1 {
	A1() {
		System.out.println("class A constructor");
	}
}

class B1 {
	B1() {
		System.out.println("class B constructor");
	}
}

class C1 extends A1 {
	B1 b = new B1();
}

public class Exec5InitBaseClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C1();
	}

}
