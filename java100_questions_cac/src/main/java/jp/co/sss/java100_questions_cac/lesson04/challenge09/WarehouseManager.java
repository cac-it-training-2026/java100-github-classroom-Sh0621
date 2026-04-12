/**
 * 第4章 倉庫番のお仕事
 *
 * 問題9 荷物の入れ替え（二つの配列を一つにまとめる）
 *
 * Yさんが勤めるXO商事では、
 * 大手運送会社であるMQ運送から、
 * 常時二つのコンテナ群を預かり委託管理を行っています。
 * 二つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると10箱の入れ物になります。
 *
 * 本日MQ運送から依頼があり、
 * コンテナ群Bのうち使っている箱は2箱しかなく、
 * コンテナ群Aに空き箱がちょうど2箱あるので、
 * 中身がある箱をコンテナ群Aにまとめてほしいと言われました。
 *
 * 各コンテナの内訳は以下の通りです。
 *
 * コンテナ群A・・・2番目と4番目の箱が空いている。
 * コンテナ群B・・・1番目と3番目と5番目の箱が空いている。
 * (空き箱には0が入っており、その他の箱には
 *  1～9の何れかの値が入っているものとする)
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  A...3,0,5,0,3
 *
 *  B...0,1,0,4,0
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  A...3,1,5,4,3
 *
 *  B...0,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package jp.co.sss.java100_questions_cac.lesson04.challenge09;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] MQArrayA = { 3, 0, 5, 0, 3 };
		int[] MQArrayB = { 0, 1, 0, 4, 0 };

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("A...");
		for (int i = 0; i < MQArrayA.length; i++) {
			System.out.print(MQArrayA[i]);
			if (i != (MQArrayA.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.print("\n\nB...");
		for (int i = 0; i < MQArrayB.length; i++) {
			System.out.print(MQArrayB[i]);
			if (i != (MQArrayB.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");


		//for文のネストを利用してMQArrayAの要素0の位置にMQArrayBの値を入れる処理を記述する。


		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("A...");
		for (int i = 0; i < MQArrayA.length; i++) {
			System.out.print(MQArrayA[i]);
			if (i != (MQArrayA.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.print("\n\nB...");
		for (int i = 0; i < MQArrayB.length; i++) {
			System.out.print(MQArrayB[i]);
			if (i != (MQArrayB.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
