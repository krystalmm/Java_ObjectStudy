/*
 * ランダムに手を決める戦略クラス
 */
public class RandomTactics implements Tactics {
	
	/*
	 * 戦略を読みジャンケンの手を得る
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された以下の定数で返す
	 * 
	 * Player.STONE
	 * Player.SCISSORS
	 * Player.PAPER
	 * 
	 * @return ジャンケンの手
	 */
	public int readTactics() {
		int hand = 0;
		
		double randomNum = Math.random() * 3;
		
		if (randomNum < 1) {
			hand = Player.STONE;
		} else if (randomNum < 2) {
			hand = Player.SCISSORS;
		} else if (randomNum < 3) {
			hand = Player.PAPER;
		}
		
		return hand;
	}
}
