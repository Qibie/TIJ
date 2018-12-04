package com.chapter4controllingexecution;

/**
 * @author qibie
 * @date 2018年12月4日 下午4:31:49   
 */
public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(condition())
			System.out.println("Inside ‘while’");
			System.out.println("Exited ‘while’");
	}

}
