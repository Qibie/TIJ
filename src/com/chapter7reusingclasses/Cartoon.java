package com.chapter7reusingclasses;

import static net.mindview.util.Print.*;

/**
 * Constructor calls during inheritance.
 * 
 * @author qibie
 * @date 2018年12月11日 下午11:58:51
 */
class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing constructor");
	}
}

public class Cartoon {
	public Cartoon() {
		print("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}
