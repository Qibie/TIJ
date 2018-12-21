package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月22日 上午12:31:57
 */
class Base1 {
	char method(char c) {
		System.out.println("method(char)");
		return 0;
	}

	double method(double c) {
		System.out.println("method(double)");
		return 0.0d;
	}

	float method(float c) {
		System.out.println("method(float)");
		return 0.0f;
	}
}

class Derived1 extends Base1 {
	boolean method(boolean c) {
		System.out.println("method(boolean)");
		return true;
	}
}

public class Exec13NameHiding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d = new Derived1();
		d.method(1>0);
		d.method('c');
		d.method(0.0d);
		d.method(0.1f);
	}

}
