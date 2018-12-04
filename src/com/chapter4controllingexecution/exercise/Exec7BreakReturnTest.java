package com.chapter4controllingexecution.exercise;

import static net.mindview.util.Range.*;

/**
 * @author qibie
 * @date 2018年12月4日 下午6:11:21
 */
public class Exec7BreakReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i : range(1, 101)) {
			if(i == 99) break;
			System.out.println(i);
		}
		for (int i : range(1, 101)) {
			if(i == 99) {
				return;
			}
			System.out.println(i);
		}
	}

}
