package exe2;

import java.util.Random;

public class WinningStrategy implements Strategy{
	private Random random;
	private boolean won = false;
	private Hand prevHand;
	public WinningStrategy(int seed){
		random = new Random(seed);
	}
	
	//前回勝ったのであれば同じ手を返し、負けたならランダムに手を出す
	@Override
	public Hand nextHand() {
		if(!won) {
			prevHand = Hand.getHand(random.nextInt(3));
		}
		return prevHand;
	}

	@Override
	public void study(boolean win) {
		won = win;
	}
}
