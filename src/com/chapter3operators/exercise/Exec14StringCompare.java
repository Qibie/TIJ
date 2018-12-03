package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月4日 上午12:47:50   
 */
public class Exec14StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		compare(s1,s2);
	}

	static void compare(String s1, String s2) {
		System.out.println("== : " + s1 == s2);
		System.out.println("!= : " + s1 != s2);
		System.out.println("equals() : " + s1.equals(s2));
	}
}
