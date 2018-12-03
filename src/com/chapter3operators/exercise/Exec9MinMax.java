package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午8:23:45   
 */
public class Exec9MinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float minFloat = 3e-45f;
		float maxFloat = 3e38f;
		double minDouble = 4.9e-324d;
		double maxDouble = 1.7e308d;
		System.out.println("minimum of float : " + minFloat);
		System.out.println("maximum of float : " + maxFloat);
		System.out.println("minimum of double : " + minFloat);
		System.out.println("maximum of double : " + maxDouble);
		System.out.println("Max double = " + Double.MAX_VALUE);
		System.out.println("Min double = " + Double.MIN_VALUE);
		System.out.println("Max float = " + Float.MAX_VALUE);
		System.out.println("Min float = " + Float.MIN_VALUE);
	}

}
