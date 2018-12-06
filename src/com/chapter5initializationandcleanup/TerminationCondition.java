package com.chapter5initializationandcleanup;

/**
 * Using finalize() to detect an object that hasn’t been properly cleaned up.
 * 
 * @author qibie
 * @date 2018年12月6日 下午2:59:17
 */
class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	void checkIn() {
		checkedOut = false;
	}
	
	protected void finalize() {
		if(checkedOut) {
			System.out.println("Error: checked out");
		}
		// Normally, you’ll also do this:
		 try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Call the base-class version1
	}
}

public class TerminationCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book novel = new Book(true);
		// Proper cleanup:
		novel.checkIn();
		// Drop the reference, forget to clean up:
		new Book(true);
		// Force garbage collection & finalization:
		System.gc();
	}

}
