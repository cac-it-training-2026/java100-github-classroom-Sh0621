/**
 * 第2章 名探偵のお仕事
 *
 * 問題3  依頼料は基準を充たしているか？
 *
 * 25行目の文を書き換えて
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 * 依頼主：
 * 宝石が見つかりましたら
 * 501円をお支払いします。
 *
 * 探偵：
 * 喜んでお引き受けします。
 *
 */

package jp.co.sss.java100_questions_cac.lesson02.challenge03;

public class Detective {

	public static void main(String[] args) {

		int budget = 200;

		System.out.println("依頼主：");
		System.out.println("宝石が見つかりましたら");
		System.out.println(budget + "円をお支払いします。\n");

		if (budget > 500) {
			System.out.println("探偵：");
			System.out.println("喜んでお引き受けします。");
		}

	}

}
