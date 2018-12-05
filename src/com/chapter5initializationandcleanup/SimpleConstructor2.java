package com.chapter5initializationandcleanup;

/**
 * Constructors can have arguments.
 * @author qibie
 * @date 2018年12月5日 下午2:51:46
 */
class Rock2 {
	Rock2(int i) {
		System.out.println("Rock " + i + " ");
	}
}

public class SimpleConstructor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++)
			new Rock2(i);
	}

}
