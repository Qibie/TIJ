package com.chapter3operators;

/** Demonstrates the ++ and -- operators.
 * @author qibie
 * @date 2018年12月3日 下午5:02:08   
 */
public class AutoInc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("i : " + i);
		// Pre-increment
		System.out.println("++i : " + ++i);
		// Post-increment
		System.out.println("i++ : " + i++);
		System.out.println("i : " + i);
		// Pre-decrement
		System.out.println("--i : " + --i);
		// Post-decrement
		System.out.println("i-- : " + --i);
	}

}
