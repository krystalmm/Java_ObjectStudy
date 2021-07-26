package Baba;

import java.util.ArrayList;

import trump.Card;
import trump.Table;

public class BabaTable implements Table {

	// 捨てられたカードを保持しておくためのリスト
	private ArrayList disposedCards_ = new ArrayList();
	
	@Override
	/**
	 * カードを捨てる
	 * 
	 * @param card 捨てるカードの配列
	 */
	public void putCard(Card[] cards) {
		for (int index = 0; index < cards.length; index++) {
			// 捨てられたカードを表示する
			System.out.print(cards[index] + " ");
		
			// 捨てられたカードはリストに追加して保持しておく
			disposedCards_.add(cards[index]);
		}
		
		System.out.println("を捨てました");
	}

	@Override
	/**
	 * カードを見る
	 * 
	 * @return テーブルに置かれたカードを表す配列
	 */
	public Card[][] getCards() {
		// ババ抜きではカードを見る必要がないのでnullを返す
		return null;
	}
}
