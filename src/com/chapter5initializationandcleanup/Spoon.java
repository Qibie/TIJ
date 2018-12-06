package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午5:26:07
 */
public class Spoon {

	static int i,j=47;
	static {
		i = 47;
		j = 0;
	}
}

class Test{
	public static void main(String[] args) {
		System.out.println("i: "+ Spoon.i + " j: " + Spoon.j);
	}
}