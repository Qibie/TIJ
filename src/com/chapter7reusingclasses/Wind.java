/**
 * 
 */
package com.chapter7reusingclasses;

/**
 * @ClassName:  Wind
 * @author: qibie-pc
 * @date:   2019年1月17日 下午10:14:51
 */
class Instrument {
	public void play() {}
	static void tune(Instrument i) {
		i.play();
	}
}

//Wind objects are instruments 
// because they have the same interface: 
public class Wind extends Instrument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wind flute = new Wind();
		// Upcasting
		Instrument.tune(flute);
	}

}
