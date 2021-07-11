/*
 * ジャンケンのプレイヤーを表すクラス
 */
public class Player {
	// ジャンケンの手を表す定数
	public static final int STONE = 0; // グー
	public static final int SCISSORS = 1; // チョキ
	public static final int PAPER = 2; // パー

	// ========================
	// プレイヤークラスの属性
	// ========================
	
	// プレイヤーの名前
	private String name_;
	
	// プレイヤーの勝った回数
	private int winCount_ = 0;
	
	
	// ========================
	// プレイヤークラスの操作
	// ========================
	/**
	 * ジャンケンの手を出す
	 * 
	 * @return ジャンケンの手
	 */
	public int showHand() {
		int hand = 0;
		
		double randomNum = Math.random() * 3;
		
		if (randomNum < 1) {
			hand = STONE;
			System.out.println("グー");
		} else if (randomNum < 2) {
			hand = SCISSORS;
			System.out.println("チョキ");
		} else if (randomNum < 3) {
			hand = PAPER;
			System.out.println("パー");
		}
		
		return hand;
	}
	
	/**
	 * 審判から勝敗を聞く
	 * 
	 * @param result true: 勝ち, false: 負け
	 */
	public void notifyResult(boolean result) {
		if (result == true) {
			winCount_ += 1;
		}
	}
	
	/**
	 * 自分の勝った回数を答える
	 * 
	 * @return 勝った回数
	 */
	public int getWinCount() {
		return winCount_;
	}
	
	/**
	 * 自分の名前を答える
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name_;
	}
	
	/*
	 * プレイヤークラスのコンストラクタ
	 * 
	 * @param name 名前
	 */
	public Player(String name) {
		name_ = name;
	}
	
}
