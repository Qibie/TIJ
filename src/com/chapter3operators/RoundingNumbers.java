package com.chapter3operators;

import static net.mindview.util.Print.*;
/** Rounding floats and doubles.
 * @author qibie
 * @date 2018年12月4日 上午12:25:15   
 */
public class RoundingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		print("Math.round(above): " + Math.round(above));
		print("Math.round(below): " + Math.round(below));
		print("Math.round(fabove): " + Math.round(fabove));
		print("Math.round(fbelow): " + Math.round(fbelow));
	}

}
