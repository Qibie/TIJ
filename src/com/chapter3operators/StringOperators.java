package com.chapter3operators;

import static net.mindview.util.Print.*;
/**
 * @author qibie
 * @date 2018年12月3日 下午11:59:03   
 */
public class StringOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z);
		// Converts x to a String
		print(x + " " + s); 
		// Concatenation operator
		s += "(summed) = "; 
		print(s + (x + y + z));
		// Shorthand for Integer.toString()
		print("" + x); 
	}

}
