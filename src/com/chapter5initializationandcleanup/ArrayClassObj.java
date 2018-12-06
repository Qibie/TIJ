package com.chapter5initializationandcleanup;

import java.util.*;
import static net.mindview.util.Print.*;
/**
 * Creating an array of nonprimitive objects.
 * @author qibie
 * @date 2018年12月6日 下午9:55:26   
 */
public class ArrayClassObj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a = " + a.length);
		for(int i = 0; i < a.length; i++)
		a[i] = rand.nextInt(500); // Autoboxing
		print(Arrays.toString(a));
	}

}
