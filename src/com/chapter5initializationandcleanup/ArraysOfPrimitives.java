package com.chapter5initializationandcleanup;

import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月6日 下午9:50:06
 */
public class ArraysOfPrimitives {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 2, 3, 4, 5, };
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++)
			a2[i] = a2[i] + 1;
		for (int i = 0; i < a1.length; i++)
			print("a1[" + i + "] = " + a1[i]);
	}

}
