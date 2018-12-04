package com.chapter4controllingexecution;

import static net.mindview.util.Print.*;
/**
 * @author qibie
 * @date 2018年12月4日 下午4:06:46   
 */
public class IfElse {

	static int result = 0;
	static void test(int testval, int target) {
		if(testval > target) {
			result = +1;
		} else if(testval < target) {
			result = -1;
		} else {
			// Match
			result = 0;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10, 5);
		print(result);
		test(5, 10);
		print(result);
		test(5, 5);
		print(result);
	}

}
