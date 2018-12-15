package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月15日 下午11:46:43   
 */
class Art {
	Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

class Cartoon2 extends Art {
	Cartoon2() {
		System.out.println("Cartoon2 constructor");
	}
}

public class Exec3BaseClassInheritance {
	public static void main(String[] args) {
		new Cartoon2();
	}
}
