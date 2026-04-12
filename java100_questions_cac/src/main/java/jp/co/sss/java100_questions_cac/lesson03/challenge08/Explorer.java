/**
 * 第3章 探検隊のお仕事
 *
 * 問題8  洞窟に入る
 *
 * 進行方向に洞窟の入り口があります。
 * 洞窟の入り口にはふしぎな石版があり数字が刻まれているのですが、
 * その数字をは1時間ごとに変わり、3が出ないと洞窟の入り口が開きません。
 * （数字の範囲は0～9の10通りです。）
 *
 * 探検隊は食糧のサバ缶を隊長のミスで全て失っており、
 * 6時間以内に洞窟に入らなければ全滅してしまいます。
 *
 * コメントの位置にdo～while文とif文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  洞窟の入り口発見！
 *  早速石版を見てみるよ。
 *
 *  隊長：
 *  5だった...
 *  1時間待つよ（0時間経過）
 *
 *  隊長：
 *  8だった...
 *  1時間待つよ（1時間経過）
 *
 *  隊長：
 *  1だった...
 *  1時間待つよ（2時間経過）
 *
 *  隊長：
 *  やったー！3が出たよ！
 *
 *  洞窟の入り口が開きました。
 *
 *
 * <6時間経過した場合の実行例>
 *  隊長：
 *  7だった...（6時間経過）
 *  あの時サバ缶に手を付けていなければ...
 *  探検隊は全滅しました。
 *
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge08;

public class Explorer {

	public static void main(String[] args) {

		System.out.println("隊長：");
		System.out.println("洞窟の入り口発見！\n");
		System.out.println("早速石版を見てみるよ。\n");

		int lithograph = 0;
		int i = 0;


		//ここにdo～while文、if文を利用した処理を記述


		if (lithograph == 3) {
			System.out.println("洞窟の入り口が開きました。");
		} else {
			System.out.println("隊長：");
			System.out.println(lithograph + "だった...（" + (i - 1)+ "時間経過）");
			System.out.println("あの時サバ缶に手を付けていなければ...");
			System.out.println("探検隊は全滅しました。");
		}
	}
}
