package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午5:57:48
 */
class Demo {
	
	Demo() {
		System.out.println("Demo()");
	}
	String str1;
	{
		str1 = "instance initialization block assignment";
		System.out.println(str1);
	}
}

public class Exec15InstanceInitialization {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main()");
		new Demo();
	}

}
