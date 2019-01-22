package com.chapter7reusingclasses.exercise;

/**
 * @author qibie
 * @date 2019年1月22日 下午11:43:07
 */
public class Exec17Frog extends Amphibian {
	@Override
	protected void swim() {
		System.out.println("Frog swim");
	}

	@Override
	protected void speak() {
		System.out.println("Frog speak");
	}

	@Override
	void eat() {
		System.out.println("Frog eat");
	}

	static void grow(Amphibian a) {
		System.out.println("Frog grow");
		a.eat();
	}

	public static void main(String[] args) {
		Exec17Frog f = new Exec17Frog();
		// call overridden base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// upcast Frog17 to Amphibian argument:
		f.grow(f);
		// upcast Frog17 to Amphibian and call Amphibian method:
		Amphibian.grow(f);
	}

}
