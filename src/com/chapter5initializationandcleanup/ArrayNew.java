package com.chapter5initializationandcleanup;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * Creating arrays with new.
 * 
 * @author qibie
 * @date 2018年12月6日 下午9:52:43
 */
public class ArrayNew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}

}
