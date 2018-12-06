package com.chapter5initializationandcleanup;

/**
 * Array initialization.
 * 
 * @author qibie
 * @date 2018年12月6日 下午9:58:48
 */
public class DynamicArray {
	public static void main(String[] args) {
		Other.main(new String[] { "fiddle", "de", "dum" });
	}
}

class Other {
	public static void main(String[] args) {
		for (String s : args)
			System.out.print(s + " ");
	}
}