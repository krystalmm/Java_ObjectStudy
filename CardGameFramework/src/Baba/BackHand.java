package Baba;

import trump.Card;
import trump.Hand;

public class BackHand {

	// 手札
	private Hand hand_;
	
	/**
	 * コンストラクタ
	 * 
	 * @param hand 手札
	 */
	public BackHand(Hand hand) {
		this.hand_ = hand;
	}
	
	/**
	 * 枚数を数える
	 * 
	 * @return 手札にあるカードの枚数
	 */
	public int getNumberOfCards() {
		return hand_.getNumberOfCards();
	}
	
	/**
	 * カードを引く
	 * 引いたカードは手札から削除される
	 * 
	 * @param position カードの位置
	 * @return position で指定された位置のカード。範囲外の場合はnullを返す
	 */
	public Card pickCard(int position) {
		return hand_.pickCard(position);
	}
}
