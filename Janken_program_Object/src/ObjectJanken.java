/**
 * オブジェクト指向によるジャンケンプログラム
 */
public class ObjectJanken {
	public static void main(String[] args) {
		// 審判のインスタンス作成
		Judge saito = new Judge();
		
//		// プレイヤー1の生成
//		Player murata = new Player("村田さん");
//		// プレイヤー2の生成
//		Player tanaka = new Player("田中さん");
		
		// プレイヤー１（グーしか出さない）
		Player murata = new Murata("村田さん");
		// プレイヤー２（パーしか出さない）
		Player tanaka = new Tanaka("田中さん");
		
		// 上記2人をプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, tanaka);
	}
}
