package com.chapter3operators;

/** operators/Precedence.java
 * @author qibie
 * @date 2018年12月3日 上午12:33:43
 */
public class Precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println("a = " + a + " b = " + b);
	}

}
