package com.chapter6accesscontrol.exercise;

/**
 * @author qibie
 * @date 2018年12月9日 下午6:16:39
 */
class FourWays {
	int a = 0;
	public int b = 1;
	protected int c = 2;
	private int d = 3;

	FourWays() {
		System.out.println("FourWays() constructor");
	}

	void showa() {
		System.out.println(a);
	}

	public void showb() {
		System.out.println(b);
	}

	protected void showc() {
		System.out.println(c);
	}

	private void showd() {
		System.out.println(d);
	}
}

public class Exec5AccessTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWays fw = new FourWays();
		fw.showa();
		fw.showb();
		fw.showc();
		fw.a = 10;
		fw.b = 20;
		fw.c = 30;
		fw.showa();
		fw.showb();
		fw.showc();
//		fw.showd(); // private access, compiler can't touch
	}

}
