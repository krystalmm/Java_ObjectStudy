/**
 * オブジェクト指向によるジャンケンプログラム
 */
public class ObjectJanken {
	public static void main(String[] args) {
		// 審判のインスタンス作成
		Judge judge = new Judge();
		
		// プレイヤー1の生成
		Player murata = new Player("村田さん");
		// プレイヤー2の生成
		Player tanaka = new Player("田中さん");
		
//		// 村田さんに渡す戦略クラスを生成する（必ずグーを出す）
//		Tactics murataTactics = new StoneOnlyTactics();
		Tactics murataTactics = new AskTactics();
		// 村田さんに戦略クラスを渡す
		murata.setTactics(murataTactics);
		
		// 田中さんに渡す戦略クラスを生成する
		Tactics tanakaTactics = new RandomTactics();
		// 田中さんに戦略クラスを渡す
		tanaka.setTactics(tanakaTactics);
		
		// プレイヤー１（グーしか出さない）
//		Player murata = new Murata("村田さん");
		// プレイヤー２（パーしか出さない）
//		Player tanaka = new Tanaka("田中さん");
		
		// 上記2人をプレイヤーとしてジャンケンを開始する
		judge.startJanken(murata, tanaka);
	}
}
