package com.chapter4controllingexecution.exercise;

/**
 * @author qibie
 * @date 20181205 1:30:42
 */
public class Exec9Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exec9Fibonacci f = new Exec9Fibonacci();
		int k = Integer.parseInt(args[0]);
		System.out.println("First " + k + " Fibonacci number(s): ");
		for (int i = 0; i < k; i++)
			System.out.println(f.fib(i));
	}

	int fib(int i) {
		// TODO Auto-generated method stub
		if (i < 2) {
			return 1;
		} else {
			return fib(i - 2) + fib(i - 1);
		}
	}
}
