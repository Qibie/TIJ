package com.chapter7reusingclasses.exercise;

import static net.mindview.util.Print.*;
/**
 * @author qibie
 * @date 2018年12月16日 上午12:14:57   
 */
class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		// print("BoardGame constructor"); // call to super must be first
		  // statement in constructor
		super(i);
		print("BoardGame constructor");
	}
}

class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
	}
}

public class Exec6Chess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chess();
	}

}
