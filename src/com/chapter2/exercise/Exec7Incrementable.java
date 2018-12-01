package com.chapter2.exercise;

/**
 * @author qibie
 * @date 2018年12月1日 下午11:42:53   
 */
public class Exec7Incrementable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StaticTest.i= " + StaticTest.i);
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st1.i= " + st1.i);
		System.out.println("st2.i= " + st2.i);
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.println("After sf.increment() called: ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		Incrementable.increment();
		System.out.println("After Incrementable.increment called: ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
	}

}

class StaticTest {
	static int i = 47;
}
class Incrementable {
	static void increment() { StaticTest.i++; }
}