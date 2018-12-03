package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午10:40:55   
 */
public class Exec10BinaryOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("i & j = " + Integer.toBinaryString(i & j));
		System.out.println("i | j = " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
	}

}
