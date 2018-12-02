package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 上午1:14:05   
 */
class Box {
	float c;
}

public class Exec3PassObject2 {
	static void f(Box b) {
		b.c = 0.12f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.c = 1.1f;
		System.out.println("1: box.a = " + box.c);
		f(box);
		System.out.println("2: box.a = " + box.c);
	}

}
