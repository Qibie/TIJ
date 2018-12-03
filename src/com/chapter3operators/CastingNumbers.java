package com.chapter3operators;

import static net.mindview.util.Print.*;

/**
 * What happens when you cast a float or double to an integral value?
 * 
 * @author qibie
 * @date 2018年12月4日 上午12:22:20
 */
public class CastingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		print("(int)above: " + (int) above);
		print("(int)below: " + (int) below);
		print("(int)fabove: " + (int) fabove);
		print("(int)fbelow: " + (int)fbelow);
	}

}
