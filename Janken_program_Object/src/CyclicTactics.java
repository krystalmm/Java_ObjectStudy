/*
 * グー・チョキ・パーを順番に出す戦略クラス
 */
public class CyclicTactics implements Tactics {
	
	// 最後に出した手（未開始：-1）
	int lastHand = -1;
	
	/*
	 * 戦略を読み、ジャンケンの手を得る
	 * 
	 * @return ジャンケンの手
	 */
	public int readTactics() {
		lastHand = (lastHand + 1) % 3;
		
		return lastHand;
	}
}
