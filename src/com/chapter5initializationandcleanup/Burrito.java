package com.chapter5initializationandcleanup;

/**
 * @author qibie
 * @date 2018年12月6日 下午6:24:26
 */
public class Burrito {
	Spiciness degree;

	Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all");
			break;
		case MILD:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burrito 
			plain = new Burrito(Spiciness.NOT),
			greenChile = new Burrito(Spiciness.MEDIUM),
			jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}

}
