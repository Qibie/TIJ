package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月16日 上午12:27:33   
 */
class Base {
	Base(int i) {
		System.out.println("Base constructor");
	}
}

class Derived extends Base{
	Derived() {
		super(11);
		System.out.println("Derived default constructor");
	}
	
	Derived(int i) {
		super(i);
		System.out.println("Derived argument constructor");
	}
}

public class Exec8ArgsConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Derived();
		new Derived(110);
	}

}
