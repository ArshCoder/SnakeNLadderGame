package SnakeGame;

import java.util.HashMap;
import java.util.Map;


public class UC1SnakeLadder {
	

	static Map<Integer, Integer> snake = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> ladder = new HashMap<Integer, Integer>();

	{
		snake.put(99, 54);
		snake.put(70, 55);
		snake.put(52, 42);
		snake.put(25, 2);
		snake.put(95, 72);

		ladder.put(6, 25);
		ladder.put(11, 40);
		ladder.put(60, 85);
		ladder.put(46, 90);
		ladder.put(17, 69);
	}

	public static void main(String[] args) {
		SnakeNLadder object = new SnakeNLadder();
		object.startGame();

	}

}
