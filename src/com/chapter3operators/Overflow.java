package com.chapter3operators;

/** Surprise! Java lets you overflow.
 * @author qibie
 * @date 2018年12月4日 上午12:43:52   
 */
public class Overflow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}

}
