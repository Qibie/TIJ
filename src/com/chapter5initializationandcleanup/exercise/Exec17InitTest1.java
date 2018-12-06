package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午10:02:11
 */
class Test1 {
	Test1(String s) {
		System.out.println("print constructor : " + s);
	}
}

public class Exec17InitTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1[] array = new Test1[10];
	}

}
