package com.chapter4controllingexecution;

import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:51:36
 */
public class ForEachInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0..9
		for (int i : range(10)) {
			printnb(i + " ");
		}
		print();
		// 5..9
		for (int i : range(5, 10)) {
			printnb(i + " ");
		}
		print();
		// 5..20 step 3
		for (int i : range(5, 20, 3)) {
			printnb(i + " ");
		}
		print();
	}

}
