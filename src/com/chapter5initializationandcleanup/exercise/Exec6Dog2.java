package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午5:14:48   
 */
class Dog2{
	void bark(int i, char s) {
		System.out.println("bark1");
	}
	void bark(char s, int i) {
		System.out.println("bark2");
	}
}

public class Exec6Dog2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog = new Dog2();
		dog.bark('c', 1);
		dog.bark(1, 's');
	}

}
