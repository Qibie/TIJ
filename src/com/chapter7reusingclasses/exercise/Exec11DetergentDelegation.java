package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.*;

/**
 * @author qibie
 * @date 2018年12月16日 上午12:44:25
 */
class Clean {
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
		Clean x = new Clean();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

class DetergentDelegation {
	private String s = "DetergentDelegation";
	Clean c = new Clean();

	public void append(String a) {
		s += a;
	}

	// two method delegated entirely to Cleanser c:
	public void dilute() {
		c.dilute();
	}

	public void apply() {
		c.apply();
	}

	// method delegated in part to Cleanser c:
	public void scrub() {
		append("DetergentDelegation.scrub()");
		c.scrub();
	}

	public void foam() {
		append(" foam()");
	}

	public String toString() {
		return s + " " + c;
	}
}

public class Exec11DetergentDelegation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Clean.main(args);
	}

}
fgt