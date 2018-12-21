package com.chapter7reusingclasses;

import static net.mindview.util.Print.*;

/**
 * The protected keyword
 * 
 * @author qibie
 * @date 2018年12月22日 上午1:20:14
 */
class Villain {
	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Villain(String name) {
		this.name = name;
	}

	public String toString() {
		return "I’m a Villain and my name is " + name;
	}
}

public class Orc extends Villain {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		// Available because it's protected
		set(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc = new Orc("Limburger", 12);
		print(orc);
		orc.change("Bob", 19);
		print(orc);
	}
}
