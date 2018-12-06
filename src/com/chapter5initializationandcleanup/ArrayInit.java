package com.chapter5initializationandcleanup;

import java.util.*;

/**
 * Array initialization.
 * @author qibie
 * @date 2018年12月6日 下午9:56:34
 */
public class ArrayInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {
				new Integer(1),
				new Integer(2),
				3, // Autoboxing
		};
		Integer[] b = new Integer[] {
				new Integer(1),
				new Integer(2),
				3, // Autoboxing
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
