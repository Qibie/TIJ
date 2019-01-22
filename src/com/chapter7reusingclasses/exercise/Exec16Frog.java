package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2019年1月22日 下午11:39:12
 */
class Amphibian {
	protected void swim() {
		System.out.println("Amphibian swim");
	}

	protected void speak() {
		System.out.println("Amphibian speak");
	}

	void eat() {
		System.out.println("Amphibian eat");
	}

	static void grow(Amphibian a) {
		System.out.println("Amphibian grow");
		a.eat();
	}
}

public class Exec16Frog extends Amphibian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exec16Frog f = new Exec16Frog();
		// call base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// upcast Frog to Amphibian argument:
		Amphibian.grow(f);
	}

}
