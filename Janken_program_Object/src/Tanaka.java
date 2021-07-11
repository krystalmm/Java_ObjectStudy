/*
 * プレイヤーを継承した田中さんクラス
 */
public class Tanaka extends Player {
	/*
	 * コンストラクタ
	 * 
	 * @param name 名前
	 */
	public Tanaka(String name) {
		super(name);
	}
	
	/*
	 * ジャンケンの手を出す
	 * スーパークラスの同名のメソッドをオーバーライドしている
	 * 
	 * @return ジャンケンの手
	 */
	public int showHand() {
		// 必ずパーを出す
		return PAPER;
	}
}
