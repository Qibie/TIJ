package com.chapter2.exercise;

/**
 * @author qibie
 * @date 2018年12月1日 下午11:54:10
 */
public class Exec10ArgTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("args[0] = " + args[0]);
//		System.out.println("args[1] = " + args[1]);
//		System.out.println("args[2] = " + args[2]);
		for(String s : args) {
			System.out.println(s);
		}
	}
}
