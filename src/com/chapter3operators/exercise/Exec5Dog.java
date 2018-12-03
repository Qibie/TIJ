package com.chapter3operators.exercise;

/**
 * @author qibie
 * @date 2018年12月3日 下午5:32:49
 */

class Dog {
	String name;
	String says;

	public Dog(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.says = string2;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", says=" + says + "]";
	}

	void setName(String n) {
		name = n;
	}

	void setSays(String s) {
		says = s;
	}

	void showName() {
		System.out.println(name);
	}

	void speak() {
		System.out.println(says);
	}
}

public class Exec5Dog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog("spot", "Ruff!");
		Dog scruffy = new Dog("scruffy", "Wurf!");
		System.out.println(spot);
		System.out.println(scruffy);
	}
}