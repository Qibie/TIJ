package com.chapter4controllingexecution.exercise;

import static net.mindview.util.Print.print;

/**
 * @author qibie
 * @date 2018年12月5日 上午1:02:42
 */
public class Exec6IfTestAddArugument {
	static int test(int testval, int begin, int end) {
		if (end < begin) {
			print("end cannot be < begin");
			return 0;
		}
		if ((testval > (begin - 1)) && (testval < (end + 1))) {
			return +1;
		}
		if ((testval < begin) || (testval > end)) {
			return -1;
		}
		print("exceptional case");
		return 13;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		print(test(10, 5, 4));
		print(test(5, 4, 10));
		print(test(5, 5, 6));
		print(test(10, 5, 7));
		print(test(5, 5, 5));
	}
}
