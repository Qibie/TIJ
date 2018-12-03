package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午11:43:22
 */
public class Exec13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = new char[] { 'a', 'b', 'A', 'B' };
		show(charArray);
		char c = 'A';
		System.out.println(Integer.toBinaryString(c));
		for (int i = 0; i < 26; i++) {
			c += 1;
			System.out.println(c + " : " + Integer.toBinaryString(c));
		}
	}

	static void show(char[] charArray) {
		// TODO Auto-generated method stub
		for (char c : charArray) {
			System.out.println(c + " : " + Integer.toBinaryString(c));
		}
	}

}
