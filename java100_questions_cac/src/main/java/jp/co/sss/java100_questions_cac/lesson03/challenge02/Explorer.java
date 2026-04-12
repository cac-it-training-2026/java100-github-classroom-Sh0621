/**
 * 第3章 探検隊のお仕事
 *
 * 問題2  食糧の準備
 *
 * 探検中の食糧としてサバ缶を50個以上用意することになりました。
 * ただし袋にサバ缶を詰められる作業は3回までしかできません。
 * サバ缶は多ければ多いほど良いので途中で50個以上に到達しても
 * 3回まではそのまま作業を繰り返します。
 *
 * コメントの位置にfor文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  サバ缶を50個以上袋に詰めてください。
 *
 *  隊長：
 *  あと3回！
 *
 *  袋に何個入れますか？＞5
 *
 *  隊長：
 *  あと2回！
 *
 *  袋に何個入れますか？＞20
 *
 *  隊長：
 *  あと1回！
 *
 *  袋に何個入れますか？＞55
 *
 *
 * <3回実行した後50個以上に達している場合の実行例>
 *
 *  隊長：
 *  OK!
 *  さあこれで探検ができるぞ！
 *
 * <3回実行したものの50個以上に達していない場合の実行例>
 *
 *  隊長：
 *  いや、足りてないから...
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("サバ缶を50個以上袋に詰めてください。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int targetCans = 50;
		int inputCans = 0;


		//ここにfor文を利用した処理を記述


		if (inputCans >= targetCans) {
			System.out.println("\n隊長：");
			System.out.println("OK!");
			System.out.println("さあこれで探検ができるぞ！");
		} else {
			System.out.println("\n隊長：");
			System.out.println("いや、足りてないから...");
		}

	}
}
