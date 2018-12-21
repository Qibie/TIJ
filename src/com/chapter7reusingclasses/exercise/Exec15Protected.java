package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月22日 上午1:33:22   
 */
class Protected {
	private void mian() {
		// TODO Auto-generated method stub
		new Exec15Protected().test();
	}
}

public class Exec15Protected {
	protected int test() {
		System.out.println("call procted method");
		return 1;
	}
	public static void main(String[] args) {
		new Exec15Protected().test();
	}
}
