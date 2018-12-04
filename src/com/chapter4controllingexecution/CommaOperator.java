package com.chapter4controllingexecution;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:41:36
 */
public class CommaOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i = " + i + " j = " + j);
		}
	}

}
