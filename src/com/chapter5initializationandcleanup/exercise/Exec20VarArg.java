package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午10:49:27   
 */
public class Exec20VarArg {
	public static void main(String... args) {
		for(String s : args) {
			System.out.println(s + " ");
		}
		System.out.println();
	}
}
