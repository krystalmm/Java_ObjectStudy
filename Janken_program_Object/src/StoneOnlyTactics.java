/*
 * グーしか出さない戦略クラス
 */
public class StoneOnlyTactics implements Tactics {
	/*
	 * 戦略を読み、ジャンケンの手を得る
	 * 
	 * @return ジャンケンの手
	 */
	public int readTactics() {
		// 必ずグーを出す
		return Player.STONE;
	}
}
