package SnakeGame;

import java.util.HashMap;
import java.util.Map;

public class UC3calculatePlayerValue {
	final static int WINPOINT = 100;
	static Map<Integer, Integer> snake = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> ladder = new HashMap<Integer, Integer>();

	public int calculatePlayerValue(int player, int diceValue)

	{
		
		player = player + diceValue;

		if (player > WINPOINT) {
			player = player - diceValue;
			return player;
		}

		if (null != snake.get(player)) {
			System.out.println("swallowed by snake");
			player = snake.get(player);
		}

		if (null != ladder.get(player)) {
			System.out.println("climb up the ladder");
			player = ladder.get(player);
		}
		return player;
	}
}
