package com.chapter2.exercise;

/**
 * @author qibie
 * @date 2018年12月1日 下午11:58:36
 */
public class Exec11AllTheColorsOfTheRainbow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
		atc.changeColor(7);
		atc.changeTheHueOfTheColor(77);
		System.out.println("After color change, atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
		System.out.println("atc.hue = " + atc.hue);	
	}

}

class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	int hue;

	void changeTheHueOfTheColor(int newHue) {
		this.hue = newHue;
	}

	int changeColor(int newColor) {
		return this.anIntegerRepresentingColors = newColor;
	}
}