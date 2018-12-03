package com.chapter3operators;

/** "e" means "10 to the power."
 * @author qibie
 * @date 2018年12月3日 下午8:18:56   
 */
public class Exponents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uppercase and lowercase ‘e’ are the same:
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		// 'd' is optional
		double expDouble = 47e47d;
		// Automatically double
		double expDouble2 = 47e47;
		System.out.println(expDouble);
	}

}
