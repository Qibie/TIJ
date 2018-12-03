package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午11:36:55
 */
public class Exec12RightShift2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 255;
		System.out.println(Integer.toBinaryString(i));
		i <<= 1;
		System.out.println(Integer.toBinaryString(i));
		for (int j = 0; j < 8; j++) {
			i >>>= 1;
			System.out.println(Integer.toBinaryString(i));
		}
	}

}
