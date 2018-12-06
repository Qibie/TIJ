package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午5:42:41   
 */
class Monkey{
	static String str1 = "static field str1";
	static {
		String str2 = "static block str2";
		System.out.println(str2);
	}
}

public class Exec14StaticInitializationTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Monkey.str1);
	}

}
