package com.chapter5initializationandcleanup;

/**
 * Demonstration of a simple constructor.
 * @author qibie
 * @date 2018年12月5日 下午2:42:14   
 */
class Rock{
	// This is the constructor
	Rock() {
		System.out.println("Rock ");
	}
}

public class SimpleConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			new Rock();
		} 
	}

}
