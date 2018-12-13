package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月14日 上午12:03:51
 */
class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

public class Exec2ExtendsTest extends Cleanser {
	public void scrub() {
		
	}
	void sterilize() {
		print("sterilize()");
	}
}
