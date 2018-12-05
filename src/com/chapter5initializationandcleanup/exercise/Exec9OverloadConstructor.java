package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午11:39:26   
 */
public class Exec9OverloadConstructor {
	
	public Exec9OverloadConstructor() {
		// TODO Auto-generated constructor stub
		this("1");
		System.out.println("call default constructor");
	}
	public Exec9OverloadConstructor(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("call argument constructor, " + string);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exec9OverloadConstructor();
	}

}
