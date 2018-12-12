package com.chapter7reusingclasses;

import static net.mindview.util.Print.*;
/**
 * Inheritance, constructors and arguments.
 * @author qibie
 * @date 2018年12月12日 上午12:04:50   
 */
class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x = new Chess();
	}

}
