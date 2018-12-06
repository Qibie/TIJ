package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午10:31:31
 */
public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		for (String s : trailing)
			System.out.print(s + " ");
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}

}
