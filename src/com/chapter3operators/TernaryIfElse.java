package com.chapter3operators;

import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月3日 下午11:52:30
 */
public class TernaryIfElse {
	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}

	static int standardIfElse(int i) {
		if (i < 10)
			return i * 100;
		else
			return i * 10;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(ternary(9));
		print(ternary(10));
		print(standardIfElse(9));
		print(standardIfElse(10));
	}

}
