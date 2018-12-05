package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午3:02:48   
 */
class Test2 {
	String s1;
	String s2 = "hello";
	String s3;
	Test2() { s3 = "good-bye"; }
}

public class Exec2ConstructorTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		System.out.println("t.s1: " + t.s1);
		System.out.println("t.s2: " + t.s2);
		System.out.println("t.s3: " + t.s3);
	}

}
