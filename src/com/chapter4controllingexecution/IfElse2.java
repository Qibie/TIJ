package com.chapter4controllingexecution;

import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:59:10
 */
public class IfElse2 {
	static int test(int testval, int target) {
		if (testval > target) {
			return +1;
		} else if (testval < target) {
			return -1;
		} else {
			// Match
			return 0;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(test(10, 5));
		print(test(5, 10));
		print(test(5, 5));
	}

}
