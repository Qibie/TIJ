package com.chapter3operators;

import static java.lang.System.out;
/**
 * @author qibie
 * @date 2018年12月3日 上午12:39:09
 */
class Tank {
	int level;
}

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		out.println("1: t1.level: " + t1.level +
				", t2.level: " + t2.level);
		t1 = t2;
		out.println("2: t1.level: " + t1.level +
				", t2.level: " + t2.level);
		t1.level = 27;
		out.println("3: t1.level: " + t1.level +
				", t2.level: " + t2.level);
	}
}