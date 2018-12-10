package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2018年12月10日 下午11:22:36   
 */
class Lazy{
	Lazy() {
		System.out.println("Lazy class constructed.");
	}
}

public class Exec1LazyInitialization {
	private Lazy lazy;
	
	public Exec1LazyInitialization() {
		// TODO Auto-generated constructor stub
		if(lazy == null) {
			lazy = new Lazy();
		}
		System.out.println("Test lazy initialization");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exec1LazyInitialization();
	}

}
