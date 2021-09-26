package SnakeGame;

import java.util.Random;

public class UC2DiceRoll {
	public int rolldice() {

    int n = 0;
    Random r = new Random();
    n=r.nextInt(7);
    return (n==0?1:n);
	}
}
