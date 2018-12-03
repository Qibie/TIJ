package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午11:30:46   
 */
public class Exec11RightShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 0x10000000;
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i < 28; i++) {
			h >>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}

}
