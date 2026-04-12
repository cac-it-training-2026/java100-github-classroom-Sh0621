/**
 * 第4章 倉庫番のお仕事
 *
 * 問題12 荷物そろえ
 *
 * OP研究所が「ふしぎなコンテナ」という特殊なコンテナを開発しました。
 * XO商事ではこのコンテナを預かり、委託管理を行うことになっています。
 *
 * このコンテナ5箱からなり、箱には
 * 0が一つと1～5の数値のうちどれか一つが重複せずに
 * 入っています。
 * 0は必ず一つだけ存在しますが、どの箱にどの値が入っているかは
 * わかりません。（ランダムに決定されます。）
 *
 * つまり、
 *
 * 3、2、0、5、4
 *
 * と並んでいる場合もあれば、
 *
 * 2、5、1、3、0
 *
 * と並んでいる場合もあります。
 *
 * OP研究所の担当者の話では、
 * この0の部分を重複しない他の値に入れ替えないと、
 * コンテナ全体が溶解してしまうため、
 * その処理を行ってほしいそうです。
 * (つまり、上記の例で言えばそれぞれ「3,2,1,5,4,」「2,5,1,3,4」に変える)
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  ふしぎなコンテナの件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  ふしコン...3,5,4,1,0
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  ふしコン...3,5,4,1,2
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package jp.co.sss.java100_questions_cac.lesson04.challenge12;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] wonderfulArray = new int[5];

		int insertNum = 0;
		int insertIndex = 0;
		boolean loopFlag;
		do {
			loopFlag = false;
			insertNum = (int) (Math.random() * 10) % 5 + 1;
			for (int i = 0; i < wonderfulArray.length; i++) {
				if (wonderfulArray[i] == insertNum) {
					loopFlag = true;
					break;
				}
			}
			if (!loopFlag) {
				wonderfulArray[insertIndex] = insertNum;
				insertIndex++;
			}
		} while (loopFlag || insertIndex < 5);

		int clearIndex = (int) (Math.random() * 10) % 5;
		wonderfulArray[clearIndex] = 0;

		System.out.println("E主任：");
		System.out.println("ふしぎなコンテナの件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("ふしコン...");
		for (int i = 0; i < wonderfulArray.length; i++) {
			System.out.print(wonderfulArray[i]);
			if (i != (wonderfulArray.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");


		//ここに適切な値の挿入処理を記述する


		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("ふしコン...");
		for (int i = 0; i < wonderfulArray.length; i++) {
			System.out.print(wonderfulArray[i]);
			if (i != (wonderfulArray.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
