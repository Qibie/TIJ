package com.chapter3operators;

/**
 * @author qibie
 * @date 2018年12月4日 上午12:11:52
 */
public class Casting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 200;
		long lng = (long) i;
		// "Widening," so cast not really required
		lng = i; 
		long lng2 = (long) 200;
		lng2 = 200;
		// A "narrowing conversion":
		// Cast required
		i = (int) lng2; 
	}

}
